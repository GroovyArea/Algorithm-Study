package 백준.Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ8958 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        String answer;
        int continuityScore;
        int sum;

        for (int i = 0; i < testCase; i++) {
            continuityScore = 0;
            sum = 0;
            answer = br.readLine();

            for (int j = 0; j < answer.length(); j++) {
                if (answer.charAt(j) == 'o') {
                    continuityScore++;
                    sum += continuityScore;
                } else {
                    continuityScore = 0;
                }
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
}
