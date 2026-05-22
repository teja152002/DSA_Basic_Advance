package striver.list;

public class PracticeList {
    Node head;

    public void add(int data) {
        Node cur = new Node();
        cur.data = data;
        cur.next = null;

        if (head == null) {
            head = cur; // 10 -> null
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next; //10.next = null
            }
            //System.out.println(cur + " ---");
            temp.next = cur; // 10.next = 20
                             // 20.next = 30
                             // 30.next = 40
        }
    }

    public void show() {
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }

    public Node convertArrToLL(int[] arr) {
        Node head = new Node();
        head.data = arr[0];
        Node mover = head;

        for(int i=1;i<arr.length;i++) {
            Node temp = new Node();
            temp.data = arr[i];
            mover.next = temp;
            mover = mover.next;
        }
        return head;
    }

    public void deleteAtFirst(){
//        Node cur = new Node();
//        cur = head;
//        head = cur.next;
        if(head == null) {
            return;
        } else {
            head = head.next;
        }
    }

    public void deleteAtLast() {
        if(head == null) {
            return;
        }
        Node cur = head;
        while(cur.next.next!=null) {
            cur = cur.next;
        }
        cur.next = null;
    }

    /**
     * 10.next != null
     * 20.next != null
     * 30.next !=null -> right
     */
    // 10-> 20-> 30->null

    static void main(String[] args) {
        PracticeList ls = new PracticeList();
        ls.add(20);
        ls.add(30);
        ls.add(40);

        ls.show();
        System.out.println("-----------");

        ls.deleteAtLast();
        ls.show();

//        int[] arr = {1,2,3,4,5};
//        Node head = ls.convertArrToLL(arr);
//        while(head!=null) {
//            System.out.println(head.data);
//            head = head.next;
//        }
    }
}
