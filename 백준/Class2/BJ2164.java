package 백준.Class2;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class BJ2164 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            q.offer(i); //  큐에 카드 숫자 넣기
        }

        while (q.size() > 1) {
            q.poll();
            Integer polledNumber = q.poll();
            q.offer(polledNumber);
        }

        System.out.println(q.peek());
    }
}
