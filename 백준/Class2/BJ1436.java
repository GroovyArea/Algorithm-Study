package 백준.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1436 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int numberOfTheEnd = 666; // 젤 작은 종말의 숫자부터 시작
        int count = 1;

        while (true) {
            if (n == count) { // 원하는 종말의 숫자가 되었다.
                break;
            } else {
                numberOfTheEnd++; // 아닐 경우 일단 계속 증가 시킴.
            }

            String stringNumber = String.valueOf(numberOfTheEnd);

            if (stringNumber.contains("666")) { // 증가된 수가 종말의 숫자를 포함할 경우 카운트를 증가
                count++;
            }
        }

        System.out.println(numberOfTheEnd);

    }
}
