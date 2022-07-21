package Programmers;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class 디스크컨트롤러 {
    public int solution(int[][] jobs) {

        int answer = 0;
        /* 처리하는 시간을 순서로 정렬하는 큐를 생성 람다식 활용 */
        Queue<int[]> queue = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        /* 작업을 시작하는 시간을 순서대로 배열 정렬 람다식 활용 */
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);

        /* 인덱스 지정 */
        int index = 0;
        /* 최초 시작 시간을 지정 */
        int time = jobs[0][0];

        /* 큐가 비어있지 않거나 인덱스의 크기가 배열 보다 넘어서지 않을 조건 */
        while (index < jobs.length || !queue.isEmpty()) {
            /* 시작 시간보다 작을 경우에만 반복 */
            while (index < jobs.length && jobs[index][0] <= time) {
                queue.add(jobs[index++]); // 큐에 배열 집어 넣기
            }
            if (queue.isEmpty()) { // 큐가 비어있을 시
                time = jobs[index][0]; // 다음 작업으로 시작 시간을 지정한다.
                queue.add(jobs[index++]); // 다음 배열을 큐에 집어 넣기
            }

            int[] work = queue.poll(); // 큐에서 가장 먼저인 처리 시간을 가진 배열 뽑기
            time += work[1]; // 작업 시간 저장
            answer += time - work[0]; // 처리 시점 시간 저장
        }
        return answer / jobs.length; // 평균 값 반환
    }
}
