package 백준.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1259 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String inputWord = br.readLine();

            boolean isChecked = true;

            if (inputWord.equals("0")) {
                break;
            }

            for (int i = 0; i < inputWord.length() / 2; i++) {
                if (inputWord.charAt(i) != inputWord.charAt(inputWord.length() - 1 - i)) {
                    isChecked = false;
                    break;
                }
            }
            if (isChecked) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }
}
