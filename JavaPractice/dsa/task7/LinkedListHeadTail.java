package dsa.task7;


class Nodes {
    Node head;
    Node tail;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = tail.next;
    }

    void delete(int position){
        Node check =head;
        for(int i=1;i<position;i++){
            check = check.next;
        }
        
    }


    void print() {
        Node start = head;
        while (start != null) {
            System.out.println(start.data);
            start = start.next;
        }
    }

    public static void main(String[] args) {

        Nodes nodes = new Nodes();

        nodes.insert(5);
        nodes.insert(8);
        nodes.insert(1);
        nodes.print();
        
        System.out.println();
    }

}