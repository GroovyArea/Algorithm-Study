package 백준.Class1;

import java.util.Scanner;

public class BJ1008 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double a = getNumber();
        double b = getNumber();

        System.out.println(divide(a, b));
    }

    protected static double divide(double a, double b) {
        return a / b;
    }

    protected static double getNumber() {
        return sc.nextDouble();
    }
}
