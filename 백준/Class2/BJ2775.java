package 백준.Class2;

import java.io.*;

public class BJ2775 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        int[][] peopleInApartmentNumbers = new int[15][15];

        for (int i = 0; i < 15; i++) {
            peopleInApartmentNumbers[i][1] = 1; // 1호엔 무조건 한명이 산다.
            peopleInApartmentNumbers[0][i] = i; // 0층에 i호는 i명이 산다.
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                peopleInApartmentNumbers[i][j] =
                        peopleInApartmentNumbers[i][j - 1] + peopleInApartmentNumbers[i - 1][j]; // 동일 층 전 호 사람 수와 바로 아래 층 같은 호 사람 수 더하면 됨.
            }
        }

        for (int i = 0; i < testCase; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(peopleInApartmentNumbers[k][n]);
        }


        // 1층 i호
        // 1+2+...+i명이 산다.
        // 2층 i호
        // (1)+(1+2)+...+(1+2+...+i) 명
    }
}
