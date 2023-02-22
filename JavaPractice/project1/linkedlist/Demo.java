package linkedlist;


public class Demo {
    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        System.out.println(ls.head);

        ls.head = ls.new Node(10);
        System.out.println(ls.head);
        System.out.println(ls.head.next);

        linkedlist.LinkedList.Node second = ls.new Node(20);
        ls.head.next = second;

        linkedlist.LinkedList.Node third = ls.new Node(30);
        second.next = third;

        System.out.println(ls.head.next.data);
    }
}