package dsa.circularLinkedList;
public class CircularLinkedList {
    Node head;
    Node tail;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    void insert(int data){
        Node newNode = new Node(data);
        
        if(head==null){
            head=newNode;
            tail=newNode;
            tail.next=head;
        }
        else{
            tail.next=newNode;
            newNode.next=head;
            tail=newNode;
        }
    }

    void insertAtHead(int data){
        Node newNode = new Node(data);
        
        if(head==null){
            head=newNode;
            tail=newNode;
            head.next=head;
        }else{
            newNode.next=head;
            tail.next=newNode;
            head=newNode;
        }
    }

    void insertAtPosition(Node position,int data){
        Node newNode = new Node(data);
        if(position==null){
            System.out.println("invalind position");
            return;
        }
        newNode.next=position.next;
        position.next=newNode;
        
    } 

    void deleteAtEnd(){
        if(tail==null){
            System.out.println("Circular Linked List is Empty....");
            return;
        }else{
            
            Node temp =head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            temp.next=head;
        }
    }
    void deleteAtBegning(){
        if(head==null){
            System.out.println("Circular Linked list is empty");
            return;
        }else{
            tail.next=head.next;
            head=head.next;
        }
    }

    void display(){
        if(head==null){
            System.out.println("CircularLinkedList is empty");
            return;
        }
        Node temp=head;
        System.out.println("Circular linked list : ");
        do{
            System.out.println(temp.data+" ");
            temp=temp.next;
        }while (temp!=head);
    }

    public static void main(String[] args) {
        
        CircularLinkedList cn = new CircularLinkedList();
        cn.insert(5);
        cn.insert(2);
        cn.display();
        cn.insertAtHead(7);
        cn.display();
        cn.deleteAtBegning();
        cn.display();
        cn.deleteAtEnd();
        cn.display();
        cn.insertAtPosition(cn.head,77);
        cn.display();
        
    }
}