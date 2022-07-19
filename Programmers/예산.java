package Programmers;

public class 예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        int count = 0;
        for (int a : d) {
            sum += a;

            if (sum == budget) {
                count++;
                answer = count;
                break;
            } else if (sum > budget) {
                answer = count;
                break;
            }
            count++;
        }
        return answer;
    }

}
