package striver.list;


public class LinkedList {
    Node head;

    public void add(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public void show() {
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void delete() {
        //Empty list
        if (head == null) {
            return;
        }

        // Only one node
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        // Stop at second-last node
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }


    public void insertAtIndex(int data, int index) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0) {
            node.next = head;
            head = node;
            return;
        }
        Node cur = head;
        for (int i = 0; i < index - 1; i++) {
            cur = cur.next;
        }
        node.next = cur.next;
        cur.next = node;
    }

}
