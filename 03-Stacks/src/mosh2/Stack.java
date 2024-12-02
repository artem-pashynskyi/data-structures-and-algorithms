package mosh2;

import java.util.Arrays;

public class Stack {

    private int[] items = new int[5];
    private int count;

    //push
    public void push(int item) {
        if(items.length == count) {
            items = new int[count * 2];
        }
        items[count++] = item;
    }

    //pop
    public int pop() {
        if(isEmpty()) {
            return -1;
        }
        return items[--count];
    }

    //peek
    public int peek() {
        return items[count - 1];
    }

    //isEmpty
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }

}
