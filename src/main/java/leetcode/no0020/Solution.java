package leetcode.no0020;

import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().isValid("()"));
        System.out.println(new Solution().isValid(""));
        System.out.println(new Solution().isValid(""));
        System.out.println(new Solution().isValid(""));
        System.out.println(new Solution().isValid(""));
    }

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if (stack.size() == 0) {
                stack.add(c);
                continue;
            }
            if (isPair(stack.peek(), c)) {
                stack.pop();
            } else {
                stack.add(c);
            }
        }
        return stack.size() == 0;
    }

    private boolean isPair(Character c1, Character c2) {
        return (c1 == '(' && c2 == ')') || (c1 == '{' && c2 == '}') || (c1 == '[' && c2 == ']');
    }

}