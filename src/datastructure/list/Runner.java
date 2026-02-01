package datastructure.list;

public class Runner {
    public static void main(String[] args) {
        datastructure.list.LinkedList list = new LinkedList();
// 1 2 3 4
// 0 1 2 3
        list.insert(2);
        list.insert(3);
        list.insert(4);

        list.insertAtStart(1);

        list.insertAt(2, 100);
        list.deleteAt(1);
        list.show();

//        list.insertAtStart(1);
//
//        list.insertAt(1, 2);
//
//        list.deleteAt(2);
//
//        list.show();


    }
}
