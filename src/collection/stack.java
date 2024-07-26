package collection;

import java.util.Stack;

public class stack {

        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();

            // Push elements onto the stack
            stack.push(10);
            stack.push(20);
            stack.push(30);

            // Pop elements from the stack
            System.out.println(stack.pop()); // 30
            System.out.println(stack.pop()); // 20
            System.out.println(stack.pop()); // 10
        }
    }


