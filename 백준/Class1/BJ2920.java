package 백준.Class1;

import java.util.Arrays;
import java.util.Scanner;

public class BJ2920 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] ascendingArr = getAscendingArr();
        int[] descendingArr = getDescendingArr();
        int[] numbers = getNumbers();

        if (Arrays.equals(numbers, ascendingArr)) {
            System.out.println("ascending");
        } else if (Arrays.equals(numbers, descendingArr)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }

    protected static int[] getNumbers() {
        int[] numbers = new int[8];

        for (int i = 0; i < 8; i++) {
            numbers[i] = sc.nextInt();
        }

        return numbers;
    }

    protected static int[] getAscendingArr() {
        int[] numbers = new int[8];

        for (int i = 0; i < 8; i++) {
            numbers[i] = i;
        }

        return numbers;
    }

    protected static int[] getDescendingArr() {
        int[] numbers = new int[8];

        for (int i = 8; i > 0; i--) {
            numbers[8 - i] = i;
        }

        return numbers;
    }


}
