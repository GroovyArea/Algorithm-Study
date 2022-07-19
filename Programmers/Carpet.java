package Programmers;

public class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int totalTiles = brown + yellow;

        for (int i = 1; i <= totalTiles; i++) {
            int width = i;
            int height = totalTiles / i;

            if (width < height) {
                continue;
            }

            if ((width - 2) * (height - 2) == yellow) {
                answer[0] = width;
                answer[1] = height;
            }
        }

        return answer;
    }
}
