package dsa.task33Dequeue;


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

public class Dequeue {
    Node front;
    Node rear;

    class Node{
        Student data;
        Node next=null;
        Node perv=null;

        Node(Student data){
            this.data=data;
        }
    }

    void add(Student data){
        Node newNode = new Node(data);
        
        if(front==null){
            front=newNode;
            rear=newNode;
        }else{
            rear.next=newNode;
            newNode.perv=rear;
            rear=rear.next;
        }
    }

    void poll(){
        front=front.next;
        front.perv=null;
    }

    void removeBack(){
        rear=rear.perv;
        rear.next=null;
    }

    void display(){
        if(front==null){
            System.out.println("queue is empty");
        }else{
            Node temp=front;
            do{
                System.out.println(temp.data);
                temp=temp.next;
            }while(temp!=null);
        }
    }


    public static void main(String[] args) {
        
        Dequeue circularQueue = new Dequeue();
        circularQueue.add(new Student(1, "Aman") );
        circularQueue.add(new Student(5, "Anmol"));
        circularQueue.add(new Student(2, "Avinash"));
        circularQueue.display();

        circularQueue.poll();

        System.out.println("After poll : ");
        circularQueue.display();

        System.out.println("After remove from rear");
        circularQueue.removeBack();
        circularQueue.display();


    }
}

