package mosh2;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);

        var stringReverser = new StringReverser();
        var result = stringReverser.reverse("adbc");
        System.out.println(result);

        var str = "(([1] + <2>))[a]";
        var expression = new Expression();
        System.out.println(expression.isBalanced(str));

        var stack2 = new mosh2.Stack();
        stack2.push(10);
        stack2.push(20);
        stack2.push(30);
        stack2.pop();
        System.out.println(stack2);
    }
}
