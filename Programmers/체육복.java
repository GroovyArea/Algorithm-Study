package Programmers;

import java.util.ArrayList;
import java.util.List;

public class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        List<Integer> reserveList = new ArrayList<>();

        for (int i : reserve) {
            reserveList.add(i);
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserveList.size(); j++) {
                boolean checkNearby = checkNearby(lost[i], reserve[i]);
                if (checkNearby) {
                    reserveList.remove(j);
                    answer++;
                    if (answer >= n) {
                        reserveList.clear();
                        break;
                    }
                }
            }
        }

        return answer;
    }

    public boolean checkNearby(int lostNum, int reserveNum) {
        return lostNum - reserveNum == 1 || lostNum - reserveNum == -1;
    }


}
