package 백준.Class2;

import java.util.Scanner;

public class BJ2609 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();

        long gcd = getGCD(a, b);

        System.out.println(gcd);
        System.out.println(getLCM(a,b,gcd));

    }

    static long getGCD(long a, long b) {
        while (b > 0) {
            long temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }

    static long getLCM(long a, long b, long gcd) {
        return (a * b) / gcd;
    }
}
