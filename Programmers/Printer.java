package Programmers;

import java.util.*;

public class Printer {

    public int solution(int[] priorities, int location) {
        int answer = 0;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i : priorities) {
            priorityQueue.add(i);
        }

        while (!priorityQueue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorityQueue.peek() == priorities[i]) {
                    priorityQueue.poll();
                    answer++;

                    if (location == i) {
                        return answer;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] p = {1, 1, 3, 2, 4};
        int a = 2;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int b : p) {
            pq.add(b);
        }

        System.out.println(pq);

        while (!pq.isEmpty())
            System.out.println(pq.poll());


        System.out.println(new Printer().solution(p, a));
    }
}
