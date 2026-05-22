package striver.list;

public class Runner {
    static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);

        list.insertAtStart(40);

        list.show();
//        System.out.println("------------");
//        list.delete();
//        list.show();

        System.out.println("-------------------");
        list.insertAtIndex(50, 1);
        list.show();

    }
}