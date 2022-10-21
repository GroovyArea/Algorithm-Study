package 백준.Class1;

import java.util.Scanner;

public class BJ1157 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] alphabet = new int[26];

        String inputString = scanner.nextLine();

        for (int i = 0; i < inputString.length(); i++) {
            if ('A' <= inputString.charAt(i) && inputString.charAt(i) <= 'Z') { // 대문자일 경우
                alphabet[inputString.charAt(i) - 'A']++;
            } else {
                alphabet[inputString.charAt(i) - 'a']++;
            }
        }

        int maxNumber = 0; // 최대 값
        char printWord = '?';

        for (int i = 0; i < 26; i++) {
            if (alphabet[i] > maxNumber) {
                maxNumber = alphabet[i];
                printWord = (char) (i + 65); // 대문자 출력
            } else if (alphabet[i] == maxNumber) {
                printWord = '?';
            }
        }

        System.out.println(printWord);
    }


}
