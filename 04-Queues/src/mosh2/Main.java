package mosh2;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);
        reverse(queue);
        System.out.println(queue);

        ArrayQueue queue1 = new ArrayQueue();
        queue1.enqueue(10);
        queue1.enqueue(20);
        queue1.enqueue(30);
        queue1.enqueue(40);
        queue1.enqueue(50);
        var front = queue1.dequeue();
        System.out.println(front);
        front = queue1.dequeue();
        System.out.println(front);
        System.out.println(queue1);
        queue1.enqueue(60);
        queue1.enqueue(70);
        System.out.println(queue1);

        QueueWithTwoStacks queue2 = new QueueWithTwoStacks();
        queue2.enqueue(10);
        queue2.enqueue(20);
        queue2.enqueue(30);
        System.out.println(queue2.dequeue());

        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(1);
        System.out.println(priorityQueue);
    }

    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}
