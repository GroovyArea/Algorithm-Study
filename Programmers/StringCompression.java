package Programmers;

public class StringCompression {

    public int solution(String s) {
        int answer = s.length();

        if (s.length() == 1) {
            return 1;
        }

        for (int i = 1; i < s.length() / 2 + 1; i++) {
            StringBuilder sb = new StringBuilder();

            int count = 0;
            String partition = s.substring(0, i); // 나눠진 문자열

            for (int j = 0; j < s.length(); j += i) {
                int end = Math.min(i + j, s.length());

                String temp = s.substring(j, end);

                if (temp.equals(partition)) {
                    count++;
                } else {
                    // 반복 횟수 1이면 숫자를 넣지 않음
                    if (count > 1) {
                        sb.append(count);
                    }

                    sb.append(partition);

                    partition = temp;

                    count = 1;
                }
            }

            // 반복 횟수 1이면 압축 문자열에 숫자를 넣지 않음
            if (count > 1) {
                sb.append(count);
            }

            sb.append(partition);

            answer = Math.min(answer, sb.length());
        }
        return answer;
    }
}
