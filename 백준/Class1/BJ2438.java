package 백준.Class1;

import java.util.Scanner;

public class BJ2438 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        printStar(inputNumber());
    }

    protected static void printStar(int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    protected static int inputNumber() {
        return sc.nextInt();
    }
}
