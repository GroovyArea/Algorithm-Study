package Programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Solution1 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Integer> bridgeQueue = new LinkedList<>();

        int totalWeight = 0; // 트럭의 총 무게

        for (int truckWeight : truck_weights) {

            while (true) {

                // 다리가 비었을 때
                if (bridgeQueue.isEmpty()) {
                    bridgeQueue.offer(truckWeight);
                    totalWeight += truckWeight;
                    answer++;
                    break;
                }

                // 다리(큐)의 사이즈와 주어진 다리의 길이가 같을 때
                else if (bridgeQueue.size() == bridge_length) {
                    totalWeight -= bridgeQueue.poll();
                }

                // 다리가 비어있지 않을 경우
                else {

                    // 다음에 다리로 들어올 트럭의 무게가 다리의 수용 무게를 초과할 경우
                    if (totalWeight + truckWeight > weight) {
                        answer++;
                        bridgeQueue.offer(0);
                    }

                    // 일반 트럭이 들어올 경우
                    else {
                        bridgeQueue.offer(truckWeight);
                        totalWeight += truckWeight;
                        answer++;
                        break;
                    }
                }
            }
        }

        return answer + bridge_length;
    }
}

class Solution2 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;

        int totalWeight = 0;
        int truckIndex = 0;
        Queue<Truck> truckQueue = new LinkedList<>();

        while (truckIndex < truck_weights.length) {
            time++;

            if (!truckQueue.isEmpty()) {
                Truck truck = truckQueue.peek();

                if (time - truck.getEnterTime() == bridge_length) {
                    totalWeight -= truck.getWeight();
                    truckQueue.poll();
                }
            }

            int nextTruck = truck_weights[truckIndex];
            if (totalWeight + nextTruck <= weight) {
                truckQueue.offer(new Truck(nextTruck, time));
                totalWeight += nextTruck;
                truckIndex++;
            }
        }

        time += bridge_length;

        return time;
    }
}

class Truck {
    private int weight;
    private int enterTime;

    public Truck(int weight, int enterTime) {
        this.weight = weight;
        this.enterTime = enterTime;
    }

    public int getWeight() {
        return weight;
    }

    public int getEnterTime() {
        return enterTime;
    }
}