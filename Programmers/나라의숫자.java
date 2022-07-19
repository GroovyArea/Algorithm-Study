package Programmers;

public class 나라의숫자 {

    private static final String[] NUMBERS = {"4", "1", "2"};

    public String solution(int n) {

        StringBuilder answer = new StringBuilder("");

        int num = n;

        while (num != 0) {
            int index = num & 3; // 3으로 나눈 나머지

            num /= 3; // 3으로 나눈 몫

            if (index == 0) {
                num--;
            }

            answer.append(NUMBERS[index]);
        }
        return answer.toString();
    }
}
