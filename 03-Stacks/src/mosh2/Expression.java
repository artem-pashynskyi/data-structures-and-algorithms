package mosh2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

//(([1] + <2>))[a]
public class Expression {

    List<Character> openBrackets = Arrays.asList('(', '[', '<', '{');
    List<Character> closeBrackets = Arrays.asList(')', ']', '>', '}');

    public boolean isBalanced(String input) {
        if(input == null) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for(char ch : input.toCharArray()) {
            if(openBrackets.contains(ch)) {
                stack.push(ch);
            }
            if(closeBrackets.contains(ch)) {
                if (stack.isEmpty()) {
                    return false;
                }
                var top = stack.pop();
                if (top == '(' && ch != ')' || top == '[' && ch != ']' || top == '<' && ch != '>' || top == '{' && ch != '}') {
                    return false;
                }
            }
        }
        return true;
    }
}
