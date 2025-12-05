package mypractice.oops;

class SingleParent {
    {
        System.out.println("A block present in single level inheritance");
    }
}

class SingleChild extends SingleParent {
    {
        System.out.println("A block present in single child, inherited from single level");
    }
}

class Multilevel extends SingleChild {
    {
        System.out.println("A block which is from multi level, inherits the properites of single child and single parent");
    }
}

class HierarchicalLevel extends SingleChild {
    {
        System.out.println("A block which is from hierarchical, inherits the properties from Single child, And Single Child inherits properties from SingelParent");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        System.out.println("--- Single Level Inheritance ---");
        new SingleChild();
        System.out.println("--- Multi Level Inheritance ---");
        new Multilevel();
        System.out.println("--- Hierarchical Level Inheritance ---");
        new SingleChild();
        new HierarchicalLevel();
    }
}
