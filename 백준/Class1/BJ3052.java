package 백준.Class1;

import java.util.Scanner;

public class BJ3052 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = new int[10];

        int sameNumberCount = 0;
        int differentCount = 0;

        for (int i = 0; i < 10; i++) {
            numbers[i] = getNumber() % 42;
        }

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (numbers[i] == numbers[j]) {
                    sameNumberCount++;
                }
            }

            if (sameNumberCount == 0) {
                differentCount++;
            }
        }

        System.out.println(differentCount);
    }

    protected static int getNumber() {
        return sc.nextInt();
    }

}
