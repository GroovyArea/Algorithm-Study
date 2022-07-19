package Programmers;

public class 이상한문자만들기 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.split("");

        int index = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(" ")) {
                index = 0;
            } else if (index % 2 == 0) {
                str[i] = str[i].toUpperCase();
                index++;
            } else {
                str[i] = str[i].toLowerCase();
                index++;
            }
            sb.append(str[i]);
        }
        return sb.toString();
    }
}
