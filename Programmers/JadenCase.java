package Programmers;

public class JadenCase {

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        String[] stringArr = s.toLowerCase().split("");

        boolean isFirst = true;

        for (String value : stringArr) {
            if (isFirst) {
                answer.append(value.toUpperCase());
            } else {
                answer.append(value);
            }
            isFirst = value.equals(" ");
        }

        return answer.toString();
    }
}
