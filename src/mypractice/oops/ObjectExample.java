package mypractice.oops;

public class ObjectExample extends Object{
    // Overriding the toString() method to get custom implementation
    @Override
    public String toString(){
        return "toString method Overriden";
    }
    int id;
    ObjectExample(int id){
        this.id = id;
    }
    @Override
    public boolean equals(Object obj){ // Upcasting
        if(obj instanceof ObjectExample){ // checking if upcasted reference is downcasting to same reference or not, if not we would get ClassCastException
            ObjectExample obj1 = (ObjectExample) obj; // Downcasting
            return this.id == obj1.id; // comparision logic - to check whether data is same or not
        } else {
            return false;
        }
    }

    @Override
    public int hashCode(){
        return 124;
    }



    public static void main(String[] args) {
//        ObjectExample obj = new ObjectExample();
//        System.out.println(obj); // Implicitly class toString() method - obj.toString()

        // equals() method - by default compare addresses if two objects, if we want to compare data, we must override
        ObjectExample o1 = new ObjectExample(23);
        ObjectExample o2 = new ObjectExample(23);
        System.out.println(o1.equals(o2));

        // hascode() method - by default, it will unique integer of an object - we can override to get custom value
        System.out.println(o1.hashCode());

    }
}
