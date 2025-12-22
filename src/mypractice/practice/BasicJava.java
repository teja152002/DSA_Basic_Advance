package mypractice.practice;

import java.util.ArrayList;

public class BasicJava {
    public static void main(String[] args) {
        /**
         * Class = blueprint
         * Object = instance of class. Object is super class in java
         * class MyClass {
         *  }
         *  Object = MyClass my  = new MyClass();
         *  Conditions : if, if else, if else if, switch, nested if
         *  loops : for, while, do, for each
         *  List : ArrayList, LinkedList, Stack, Vector
         *  Set : HashSet, LinkedHashset, TreeSet
         *  Queue : PriorityQueue
         *  Map : HashMap, LinkedHashmap, TreeMap,
         */
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(10);
        al.add(20);
        System.out.println(al);
        // Updating
        al.add(0,0);
        System.out.println(al);

        //getting
        System.out.println(al.get(5));

        //deleting
        al.remove(1) ; // al.remove((Integer) 10);
        System.out.println(al);
    }

}
