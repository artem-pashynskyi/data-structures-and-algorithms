package mosh2;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    //[10, 20, 30]
    //addFirst
    public void addFirst(int item) {
        var node = new Node(item);
        if(isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    //[10, 20, 30]
    //addLast
    public void addLast(int item) {
        var node = new Node(item);
        if(isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    //[10, 20, 30]
    //removeFirst
    public void removeFirst() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        if(first == last) {
            first = last = null;
        } else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    //[10, 20, 30]
    //removeLast
    public void removeLast() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        if(first == last) {
            first = last = null;
        } else {
            var previous = getPrevious(last);
            previous.next = null;
            last = previous;
        }
        size--;
    }

    //contains
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    //indexOf
    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if(current.value == item) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    //size
    public int size() {
        return size;
    }

    //toArray
    public int[] toArray() {
        var array = new int[size];
        var current = first;
        var index = 0;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    //[10 -> 20 -> 30]
    //[30 -> 20 -> 10]
    //reverse
    public void reverse() {
        if(isEmpty()) {
            return;
        }
        var previous = first;
        var current = first.next;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;
    }

    //[10 -> 20 -> 30 -> 40 -> 50]
    //             1            2
    //getKthFromTheEnd
    public int getKthFromTheEnd(int k) {
        if(isEmpty()) {
            return -1;
        }

        var pointer1 = first;
        var pointer2 = first;

        for(int i = 1; i < k; i++) {
            pointer2 = pointer2.next;
            if(pointer2 == null) {
                throw new IllegalArgumentException();
            }
        }

        while (pointer2 != last) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }

        return pointer1.value;
    }

    private boolean isEmpty() {
        return first == null;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if(current.next == last) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
}
