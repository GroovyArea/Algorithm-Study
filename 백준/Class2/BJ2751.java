package 백준.Class2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BJ2751 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testNumberCount = Integer.parseInt(br.readLine());
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < testNumberCount; i++) {
            numbers.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(numbers);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < testNumberCount; i++) {
            sb.append(numbers.get(i)).append("\n");
        }

        System.out.println(sb);
    }
}
