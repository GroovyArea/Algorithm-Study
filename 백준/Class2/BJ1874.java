package 백준.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ1874 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        int first = 0;

        while (N-- > 0) {

            int nextNumber = Integer.parseInt(br.readLine());

            if (nextNumber > first) {
                for (int i = first + 1; i <= nextNumber; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');
                }
                first = nextNumber;
            } else if (stack.peek() != nextNumber) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append('-').append('\n');

        }

        System.out.println(sb);
    }

}
