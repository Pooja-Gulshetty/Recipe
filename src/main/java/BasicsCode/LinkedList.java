package BasicsCode;

public class LinkedList {
    Node head;

    //this node class will create the node
    //inner class of this linked list class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void printLinkedListValues() {
        //here i will create reference to the node head to pointing
        // to the head its start to count to the first head
        Node n = head;
        //here i am keep traverse to the particular direction to found null and stop to troverseing
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }

    }

    public static void main(String[] args) {
        //here create the object of the particular linked list class
        LinkedList list = new LinkedList();
        Node first = list.new Node(10);
        list.head = first;
        Node second = list.new Node(20);
        first.next = second;
        Node third = list.new Node(50);
        second.next = third;
        Node fourth = list.new Node(60);
        third.next = fourth;
        list.printLinkedListValues();
    }
}

