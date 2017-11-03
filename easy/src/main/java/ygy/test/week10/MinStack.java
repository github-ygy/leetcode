package ygy.test.week10;

import java.util.Stack;

/**
 * Created by guoyao on 2017/11/3.
 */
public class MinStack {

    Integer min = Integer.MAX_VALUE ;
    Stack<Integer> stack=new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        if (x <= min) {
            stack.push(min);
            min = x ;
        }
        stack.push(x);
    }

    public void pop() {
        if(stack.pop().equals(min))
            min=stack.pop();
    }

    public int top() {
        return stack.peek() ;
    }

    public int getMin() {
        return  min ;
    }

    public static void main(String[] args) {
        MinStack minStack=new MinStack();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(512);
        minStack.pop();
        //System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.pop();
        //System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
