package com.mycompany.pratice;

import java.util.Stack;

public class ValidParanthesis {

    public static boolean main(String[] args) {
        String s = "{}";

        Stack<Character> stk = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '{' || ch == '(' || ch == '[') {
                stk.push(ch);
            }
            if (!stk.isEmpty()) {
                if (ch == '}' && stk.peek() == '{') {
                    stk.pop();
                }
                if (ch == ')' && stk.peek() == '(') {
                    stk.pop();
                }
                if (ch == ']' && stk.peek() == ']') {
                    stk.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}
