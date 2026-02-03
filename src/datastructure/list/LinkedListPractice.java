package datastructure.list;

public class LinkedListPractice {
    Node head;

    // Insert
    public void insert(int data) {
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

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0) {
            node.next = head;
            head = node;
        } else if (index > size()) {
            insert(data);
        } else { // 1 2 3 4 5 = index = 2, data = 100
            Node current = head; // 1
            for (int i = 0; i < index - 1; i++) {
                current = current.next; // 2
            }
            node.next = current.next;
            current.next = node;
        }

    }

    public int size() {
        Node current = head;
        int count = 1;
        while (current.next != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void deleteAt(int index) {

        if (index == 0) {
            head = head.next;
        } else { // 1 2 3 4 -> index = 2  Then
            Node current = head; // 1 -> index = 0
            Node temp = null;
            for (int i = 0; i < index - 1; i++) {
                current = current.next; // 2 -> index = 1
            }
            // Temp is for identifying the node to delete
            temp = current.next; // 3 -> index = 2
            // 2.next = 40 -> explanation of 76 line
            current.next = temp.next; // In place of index address we are storing next address of 3
        }
    }


    public void show() {
        Node current = head;
        while (current.next != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.print(current.data + " ");
        System.out.println();
    }
}
