package linkedlist;

class LinkedList {
    Node head = null;

    class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }

        @Override
        public String toString() {
            return "Node [data=" + data + ", next=" + next + "]";
        }

    }
}
