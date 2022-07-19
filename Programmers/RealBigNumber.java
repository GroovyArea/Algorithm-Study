package Programmers;

import java.util.Arrays;
import java.util.Comparator;

public class RealBigNumber {

    public String solution(int[] numbers) {

        String answers = "";

        String[] sNumbers = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            sNumbers[i] += Integer.toString(numbers[i]);
        }

        Arrays.sort(sNumbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        if (sNumbers[0].equals("0")) {
            return "0";
        }

        return String.join("", sNumbers);

    }

    public static void main(String[] args) {

        int[] arr = {1, 32, 54, 78, 97};
        System.out.println(new RealBigNumber().solution(arr));
    }
}
