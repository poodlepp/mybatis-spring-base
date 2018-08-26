package app01a;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack<Integer>();
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.add(6);
        stack.push(7);
        while(stack.size() > 0){
            System.out.println(stack.pop());
        }
    }
}
