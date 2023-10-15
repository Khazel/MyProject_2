package Lecture_12.Lecture_12.stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push -> Peek -> Pop
        stack.push(1);
        stack.push(1);
        stack.push(5);
        stack.push(11);
        stack.push(3);
        stack.push(6);


        System.out.println(stack.toString());
        System.out.println("Peek " + stack.peek());
        System.out.println(stack.toString());
        System.out.println("Pop " + stack.pop());
        System.out.println(stack.toString());
        System.out.println("Peek " + stack.peek());

        stack.add(7);
        stack.add(8);
        System.out.println(stack.toString());

        System.out.println(stack.get(5));
    }
}
