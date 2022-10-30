package 백준.Class2;

import java.io.*;
import java.util.Stack;

public class BJ9012 {

    static final String YES = "YES";
    static final String NO = "NO";
    static Stack<Character> stack;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String parenthesis = br.readLine();
            checkValidParenthesis(parenthesis);
        }

    }

    static void checkValidParenthesis(String parenthesis) {
        char[] chars = parenthesis.toCharArray();

        for (char c : chars) {
            if (c == ')') {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            } else {
                stack.push(c);
            }
        }

        if (stack.isEmpty()) {
            System.out.println(YES);
        } else {
            System.out.println(NO);
        }
    }
}
