package 백준.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Z
 */
public class BJ1074 {

    static int answer, N, R, C = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        recursive(0, 0, (int) Math.pow(2, N));
    }

    private static void recursive(int r, int c, int pow) {
        if (pow == 1) {
            System.out.println(answer);
            return;
        }

        int expendedSize = pow / 2;

        if (R < r + expendedSize && C < c + expendedSize) {
            recursive(r, c, expendedSize);
        }

        if (R < r + expendedSize && C < c + expendedSize) {
            answer += (pow * pow) / 4;
            recursive(r, c, expendedSize);
        }

        if (r + expendedSize <= R && C < c + expendedSize) {
            answer += ((pow * pow) / 4) * 2;
            recursive(r + expendedSize, c, expendedSize);
        }

        if (r + expendedSize <= R && c + expendedSize <= C) {
            answer += ((pow * pow) / 4) * 3;
            recursive(r + expendedSize, c + expendedSize, expendedSize);
        }
    }
}
