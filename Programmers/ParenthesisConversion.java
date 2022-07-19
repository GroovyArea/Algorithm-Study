package Programmers;

import java.util.Stack;

public class ParenthesisConversion {

    static int divisor;

    public String solution(String p) {
        if (p.equals("")) {
            return p;
        }

        boolean right = isCorrect(p);

        // u,v로 분리.
        String u = p.substring(0, divisor);
        String v = p.substring(divisor);

        // 올바른 괄호 문자열이라면 3. 시행
        if (right) {
            return u + solution(v);
        }

        // 올바른 괄호문자열이 아니라면 4. 시행
        StringBuilder answer = new StringBuilder("(" + solution(v) + ")");

        for (int i = 1; i < u.length() - 1; i++) {
            if (u.charAt(i) == '(') {
                answer.append(")");
            } else answer.append("(");
        }

        return answer.toString();
    }

    // 올바른 괄호 문자열인지 판별.
    public boolean isCorrect(String p) {
        Stack<Character> st = new Stack<>();

        boolean right = true;

        int open = 0;
        int close = 0;

        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') {
                open++;
                st.push('(');
            } else {
                close++;
                if (!st.isEmpty()) {
                    st.pop();
                } else {
                    right = false;
                }
            }
            if (open == close) {
                divisor = i + 1;
                return right;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        System.out.println(new ParenthesisConversion().solution(")("));
    }
}
