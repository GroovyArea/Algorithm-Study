package Programmers;

import java.util.PriorityQueue;

public class Spicy {

    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int answer = 0;

        for (int i : scoville) {
            pq.offer(i);
        }

        while (!pq.isEmpty()) {
            int currentScoville = pq.poll();

            if (currentScoville < K) {
                if (pq.size() == 0) {
                    return -1;
                }
                int nextScoville = pq.poll();
                int sumScoville = currentScoville + nextScoville * 2;
                pq.offer(sumScoville);
                answer++;

            }
        }
        return answer;
    }
}
