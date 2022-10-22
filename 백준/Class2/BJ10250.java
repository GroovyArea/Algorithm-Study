package 백준.Class2;

import java.util.Scanner;

public class BJ10250 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int height = sc.nextInt();
            int width = sc.nextInt();
            int guest = sc.nextInt();

            int roomNumber = getRoomNumber(height, width, guest);

            System.out.println(roomNumber);
        }
    }

    // 방 번호 반환 함수
    private static int getRoomNumber(int height, int width, int guest) {
        int[] rooms = new int[height * width]; // 방 배열

        int roomIndex = 0;

        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= height; j++) {
                rooms[roomIndex] = j * 100 + i; // 백번대 이므로 100 곱하기
                roomIndex++;
            }
        }

        return rooms[guest - 1]; // 해당 방 번호 반환
    }
}
