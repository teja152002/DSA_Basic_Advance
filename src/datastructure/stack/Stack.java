package datastructure.stack;

public class Stack {

    int[] stack = new int[5];
    int top = 0;

    public void push(int data) {
        if (top == 5) {
            System.out.println("Stack is full !");
        } else {
            stack[top] = data;
            top++;
        }
    }

    public int pop() {
        int data = 0;
        if (top == 0) {
            System.out.println("Stack is Empty !");
        } else {
            top--; // here we need to decrement it to minus one. Because in push we are incrementing + 1. So it will pointing to next element or last element + 1.
            data = stack[top];
            stack[top] = 0;
        }
        return data;
    }

    public void show() {
        for (int i = 0; i < stack.length; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public int peek() {
        return stack[top - 1];
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
