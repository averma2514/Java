package dsa.task31QueueCustomData;

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

class QueueMain {
    
    Node rear;
    Node front;

    class Node{
        Student data;
        Node next=null;

        Node(Student data){
            this.data=data;
        }
    }

    void add(Student data){
        Node newnode = new Node(data);

        if(rear==null){
            front=newnode;
            rear=newnode;
        }else{
            rear.next=newnode;
            rear=rear.next;
        }
    }

    void poll(){
        front=front.next;
    }

    void peek(){
        if(front != null){
            System.out.println(front.data);
        }
    }


    void display(){
        Node temp=front;
        if(temp==null){
            System.out.println("queue is empty");
            return;
        }

        do{
            System.out.println(temp.data);
            temp=temp.next;
        }
        while(temp!=null);
    }

    public static void main(String[] args) {
    QueueMain queue = new QueueMain();
        queue.add(new Student(1,"aman"));
        queue.add(new Student(2, "avinash"));
        System.out.println("After adding some data in queue : ");
        queue.display();
        
        System.out.print("peek function ");
        queue.peek();
        
        queue.poll();

        System.out.print("After poll function : ");
        queue.display();
    }
}
