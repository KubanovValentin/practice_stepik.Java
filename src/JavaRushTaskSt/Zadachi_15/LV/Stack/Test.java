package JavaRushTaskSt.Zadachi_15.LV.Stack;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int x = stack.pop();
        stack.push(4);
        int y = stack.peek();
        stack.pop();
        stack.pop();
        System.out.println(stack);
    }
}
