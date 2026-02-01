package datastructure.queue;

public class Queue {
    int queue[] = new int[5];
    int size;
    int front;
    int rear;

    public void enQueue(int data) {
        if (!isFull()) {
            queue[rear] = data;
            rear++;
            size++;
        } else {
            System.out.println("Queue is Full");
        }

    }

    public boolean isFull() {
        return size == 5;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int deQueue() {
        int data = queue[front];
        if (!isEmpty()) {
            front = front + 1;
            size = size - 1;
        } else {
            System.out.println("Queue is empty");
        }
        return data;
    }

    public void show() {

        for (int i = 0; i < queue.length - front; i++) {
            System.out.print(queue[front + i] + " ");
        }
        System.out.println();
    }
}
