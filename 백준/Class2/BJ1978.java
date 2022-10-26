package 백준.Class2;

import java.util.Scanner;

public class BJ1978 {

    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int number = sc.nextInt();
            check(number);
        }

        System.out.println(count);
    }

    public static void check(int number) {
        if (number == 1) {
            return;
        }

        for (int i = 2; i <= number; i++) {
            if (number == i) {
                count++;
            }

            if ((number % i) == 0) {
                return;
            }
        }
    }
}
