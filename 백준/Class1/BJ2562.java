package 백준.Class1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BJ2562 {

    private static final Scanner sc = new Scanner(System.in);

    private static List<Integer> numbers;
    private static int maxValue;
    private static int index;

    public static void main(String[] args) {
        inputNumbers();
        setValues();

        System.out.println(maxValue);
        System.out.println(index);
    }

    protected static int inputNumber() {
        return sc.nextInt();
    }

    protected static void inputNumbers() {
        numbers = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            numbers.add(inputNumber());
        }
    }

    protected static void setValues() {
        index = 0;
        maxValue = 0;

        for (int i = 0; i < 9; i++) {
            if (numbers.get(i) > maxValue) {
                maxValue = numbers.get(i);
                index = i + 1;
            }
        }
    }
}
