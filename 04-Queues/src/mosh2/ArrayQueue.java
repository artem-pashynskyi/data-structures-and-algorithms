package mosh2;

import java.util.Arrays;

public class ArrayQueue {

    private int[] items = new int[5];
    private int front;
    private int rear;
    private int count;

    //[10,20,30,40,50]
    // f      r
    public void enqueue(int item) {
        if(isFull()) {
            throw new IllegalArgumentException();
        }
        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    public int dequeue() {
        var item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    public int peek() {
        return items[front];
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return items.length == count;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

}
