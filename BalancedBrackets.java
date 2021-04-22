package com.company;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        System.out.println(isBalanced("[]][{]{(({{)[})(}[[))}{}){[{]}{})()[{}]{{]]]){{}){({(}](({[{[{)]{)}}}({[)}}([{{]]({{"));
    }

    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']') {
            return "NO";
        }
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            //char temp=stack.peek();
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return "NO";
            } else {
                if ((c == ')' && stack.peek() == '(') || (c == '}' && stack.peek() == '{') || (c == ']' && stack.peek() == '[')) {
                    stack.pop();
                } else {
                    return "NO";
                }
            }
        }
        if (!stack.isEmpty()) {
            return "NO";
        } else {
            return "YES";
        }
    }
}