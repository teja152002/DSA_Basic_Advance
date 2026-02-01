package datastructure.list;

public class LinkedList {
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null; // by default it is null. Again we are declaring for understadinng purpose
        if (head == null) {
            head = node; // here node -> data = 10 | next = null
            // System.out.println(node.data + " -> " + node.next);
        } else {
            Node current = head;
            //System.out.println(current.data + " _ " + current.next);
            while (current.next != null) { // null !=null
                current = current.next;
            }
            current.next = node;
        }
    }

    public void show() {
        Node node = head;

        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;       // ex : 5
        node.next = null;

        node.next = head; // node.next = address of head will be stored
        head = node; // address of node will be stored. So that node.data and node.next will be now access through head.

    }

    public void insertAt(int index, int data) {
        // index : 1 , data : 2
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0) {
            //insertAtStart(data); // or else below logic
            node.next = head;
            head = node;
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        node.next = current.next;
        current.next = node;
    }

    public void deleteAt(int index) {
        // ex : 1,2,3,4,5
        if (index == 0) {
            head = head.next;
        } else {
            Node current = head; // here it pointing  to 1
            Node n1 = null; // temp to store deleting data. and for connecting to previous node to next node between is the deleting node.
            for (int i = 0; i < index - 1; i++) { // why index - 1 ? because we need to stop at previous node of the deleting element.
                current = current.next; // here it pointing  to 2
                // head -> o index , i = 0 -> 1 st index. So if we want to delete index = 2, we need to stop at index.
            }
            n1 = current.next; // n1 = 3
            current.next = n1.next; // current = 4
            System.out.println("The deleted data is -> " + n1.data);
        }
    }
}


