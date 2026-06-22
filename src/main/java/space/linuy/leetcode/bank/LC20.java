package space.linuy.leetcode.bank;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 */
public class LC20 {

    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '{':
                case '[':
                case '(':
                    charStack.push(c);
                    break;
                case '}':
                    if (charStack.isEmpty()) {
                        return false;
                    }
                    Character peek = charStack.peek();
                    if (peek != '{') {
                        return false;
                    }
                    charStack.pop();
                    break;
                case ']':
                    if (charStack.isEmpty()) {
                        return false;
                    }
                    Character peek2 = charStack.peek();
                    if (peek2 != '[') {
                        return false;
                    }
                    charStack.pop();
                    break;
                case ')':
                    if (charStack.isEmpty()) {
                        return false;
                    }
                    Character peek3 = charStack.peek();
                    if (peek3 != '(') {
                        return false;
                    }
                    charStack.pop();
                    break;
            }
        }
        return charStack.empty();
    }

    public static void main(String[] args) {
        new LC20().isValid("()[]{}");
    }
}
