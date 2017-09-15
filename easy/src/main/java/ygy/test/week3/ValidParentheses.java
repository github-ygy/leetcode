package ygy.test.week3;

import java.util.Stack;

/**
 * Created by guoyao on 2017/9/15.
 */
public class ValidParentheses {

    public static void main(String[] agrs) {

        System.out.println(isValid("()()(){}[]"));
        System.out.println(isValid_2("()()(){}[]"));
    }

    /**
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
     */

    //leetcode discussion 参考
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
            else if(s.charAt(i) == ')' && !stack.empty() && stack.peek() == '(')
                stack.pop();
            else if(s.charAt(i) == ']' && !stack.empty() && stack.peek() == '[')
                stack.pop();
            else if(s.charAt(i) == '}' && !stack.empty() && stack.peek() == '{')
                stack.pop();
            else
                return false;
        }
        return stack.empty();
    }

    //leetcode discussion 参考
    public static boolean isValid_2(String s) {
        Stack<Integer> p = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            int q = "(){}[]".indexOf(s.substring(i, i + 1));
            if(q % 2 == 1) {
                if(p.isEmpty() || p.pop() != q - 1) return false;
            } else p.push(q);
        }
        return p.isEmpty();
    }

}
