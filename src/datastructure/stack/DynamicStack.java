package datastructure.stack;

import java.util.ArrayList;

public class DynamicStack {

    ArrayList stack = new ArrayList();
    int top = 0;

    public void push(int data) {
        if (top == 5) {
            System.out.println("Stack is full !");
        } else {
            // stack[top] = data;
            stack.add(top, data);
            top++;
        }
    }

    public int pop() {
        int data = 0;
        if (top == 0) {
            System.out.println("Stack is Empty !");
        } else {
            top--; // here we need to decrement it to minus one. Because in push we are incrementing + 1. So it will pointing to next element or last element + 1.
//            data = stack[top];
//            stack[top] = 0;
            data = (int) stack.get(top);
            stack.remove((Integer) data);

        }
        return data;
    }

    public void show() {
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
    }

    public int peek() {
        // return stack[top - 1];
        return (int) stack.get(top - 1);
    }

    public int size() {
//        int size = 0;
//        for (int i = 0; i < stack.length; i++) {
//            if (stack[i] != 0) {
//                size++;
//            }
//        }
//        return size;
        return top;
    }

    public boolean isEmpty() {
        return top <= 0;
    }

}
