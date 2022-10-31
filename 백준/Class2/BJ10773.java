package 백준.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ10773 {

    static Stack<Integer> stack;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        stack = new Stack<>();

        int K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            int number = Integer.parseInt(br.readLine());

            if (number == 0) {
                stack.pop();
            } else {
                stack.push(number);
            }
        }

        int sumOfMoney = getSumOfMoney(stack);
        System.out.println(sumOfMoney);
    }

    static int getSumOfMoney(Stack<Integer> stack) {
        int sum = 0;

        for (Integer integer : stack) {
            sum += integer;
        }

        return sum;
    }
}
