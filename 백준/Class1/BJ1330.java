package 백준.Class1;

import java.util.Scanner;

public class BJ1330 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        double a = getNumber();
        double b = getNumber();

        System.out.println(compareBigAndSmall(a, b));
    }

    protected static double getNumber() {
        return SCANNER.nextDouble();
    }

    protected static String compareBigAndSmall(double a, double b) {
        if (a > b) {
            return ">";
        } else if (a < b) {
            return "<";
        } else return "==";
    }

}
