package 백준.Class2;

import java.util.Scanner;

public class BJ11050 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int answer = doFactorial(n) / (doFactorial(k) * doFactorial(n - k));

        System.out.println(answer);
    }

    public static int doFactorial(int count) {
        int totalMultiply = 1;

        for (int i = 1; i <= count; i++) {
            totalMultiply *= i;
        }

        return totalMultiply;
    }
}
