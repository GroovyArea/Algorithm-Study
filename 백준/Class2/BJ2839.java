package 백준.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2839 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        while (true) {
            if (n % 5 == 0) { // 5kg로 바로 나누어 떨어질 경우
                System.out.println(n / 5 + count); // 이 몫의 개수만 들고가~
                break;
            } else if (n < 0) { // 말도 안되는 중량
                System.out.println(-1);
                break;
            }
            n = n - 3; // 위의 조건 미 충족 시 일단 3kg 제하고
            count++; // 3kg 봉지 하나 가져가~
        }
    }
}
