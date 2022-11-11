package 백준.Class3;

import java.io.*;

public class BJ1463 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n + 1];

//        dp[1] = 0;
//        dp[2] = 1;
//        dp[3] = 1;
//        dp[4] = 2;
//        dp[5] = 3;
//        dp[6] = 2;

        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + 1; // 1을 먼저 뺀 값이라 봐도 무방

            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

        }

        bw.write(dp[n] + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
