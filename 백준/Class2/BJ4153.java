package 백준.Class2;

import java.util.Scanner;

public class BJ4153 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                System.exit(0);
            }

            double a2 = Math.pow(a, 2);
            double b2 = Math.pow(b, 2);
            double c2 = Math.pow(c, 2);

            if (a2 + b2 == c2) {
                System.out.println("right");
            } else if (a2 + c2 == b2) {
                System.out.println("right");
            } else if (b2 + c2 == a2) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
