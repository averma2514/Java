package dsa.task32CircularQueue;


class Student{
    private int id;
    private String name;

    Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    
}

public class CircularQueue {
    Node front;
    Node rear;

    class Node{
        Student data;
        Node next=null;

        Node(Student data){
            this.data=data;
        }
    }

    void add(Student data){
        Node newNode = new Node(data);
        
        if(front==null){
            front=newNode;
            rear=newNode;
            rear.next=front;
        }else{
            rear.next=newNode;
            rear=rear.next;
            rear.next=front;
        }
    }

    void poll(){
        front=front.next;
        rear.next=front;
    }

    void display(){
        if(front==null){
            System.out.println("queue is empty");
        }else{
            Node temp=front;
            do{
                System.out.println(temp.data);
                temp=temp.next;
            }while(temp!=front);
        }
    }


    public static void main(String[] args) {
        
        CircularQueue circularQueue = new CircularQueue();
        circularQueue.add(new Student(1, "Aman") );
        circularQueue.add(new Student(5, "Anmol"));
        circularQueue.add(new Student(2, "Avinash"));
        circularQueue.display();

        circularQueue.poll();

        System.out.println("After poll : ");
        circularQueue.display();


    }
}
