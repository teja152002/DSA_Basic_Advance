package datastructure.list;

public class Runner {
    public static void main(String[] args) {
        LinkedListPractice list = new LinkedListPractice();
// 1 2 3 4
// 0 1 2 3
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        list.show();

        list.deleteAt(2);
        System.out.println("After deleting index 2 -> ");
        list.show();
//
//        list.insertAtStart(1);
//        list.show();
//
//        list.insertAt(5, 100);
//        list.show();
//
//        System.out.println("Size of list -> " + list.size());
//
//        list.deleteAt(1);
//
//        list.show();
//        System.out.println("After deleting list size -> " + list.size());
//
//        list.insertAtStart(1);
//
//        list.insertAt(2, 100);
//        list.deleteAt(1);
//        list.show();

//        list.insertAtStart(1);
//
//        list.insertAt(1, 2);
//
//        list.deleteAt(2);
//
//        list.show();


    }
}
