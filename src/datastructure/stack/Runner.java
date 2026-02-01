package datastructure.stack;

public class Runner {
    public static void main(String[] args) {
        //Stack st = new Stack();
        DynamicStack st = new DynamicStack();
        System.out.println("Before pushing any value isEmpty() : " + st.isEmpty());
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        //st.push(50);
        //st.push(60);

        st.show();

        System.out.println("pop element -> " + st.pop());

        st.show();

        System.out.println("Peek element -> " + st.peek());

        st.show();

        System.out.println("size of stack -> " + st.size());

        System.out.println("After implementing all the values isEmpty() : " + st.isEmpty());

        st.show();
    }
}
