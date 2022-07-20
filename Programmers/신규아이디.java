package Programmers;

public class 신규아이디 {
    public String solution(String new_id) {

        // 1. 모든 문자 소문자로
        String one = new_id.toLowerCase();

        // 2. 지정 특수문자외 모두 제거
        String two = removeSpecialCharacter(one);

        // 3. 중복 마침표 치환
        String three = replaceDuplicatePeriods(two);

        // 4. 첫과 끝 마침표 제거
        String four = removePeriods(three);

        // 5. a 대입
        String five = insertA(four);

        // 6. 문자열 길이 맞추기
        String six = removeLength(five);

        // 7. 길이 3 맞추기
        return insertUntilThree(six);
    }

    public String removeSpecialCharacter(String one) {
        char[] oneArr = one.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : oneArr) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || (c == '-') || (c == '_') || (c == '.')) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public String replaceDuplicatePeriods(String two) {
        String str = two.replace("..", ".");
        while (str.contains("..")) {
            str = str.replace("..", ".");
        }
        return str;
    }

    public String removePeriods(String three) {
        String str = three;
        if (str.length() > 0) {
            char first = str.charAt(0);
            if (first == '.') {
                str = str.substring(1);
            }
        }
        if (str.length() > 0) {
            char last = str.charAt(str.length() - 1);
            if (last == '.') {
                str = str.substring(0, str.length() - 1);
            }
        }
        return str;
    }


    public String insertA(String four) {
        String str = four;
        if (str.equals("")) {
            str += "a";
        }
        return str;
    }

    public String removeLength(String five) {
        String str = five;
        if (str.length() >= 16) {
            str = str.substring(0, 15);
            if (str.charAt(str.length() - 1) == '.') {
                str = str.substring(0, str.length() - 1);
            }
        }
        return str;
    }

    public String insertUntilThree(String six) {
        StringBuilder str = new StringBuilder(six);
        if (str.length() <= 2) {
            char last = str.charAt(str.length() - 1);
            while (str.length() < 3) {
                str.append(last);
            }
        }
        return str.toString();
    }
}
