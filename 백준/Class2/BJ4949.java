package 백준.Class2;

import java.io.*;
import java.util.Stack;

/**
 * 균형잡힌 세상
 */
public class BJ4949 {

    static final String YES = "yes";
    static final String NO = "no";

    static Stack<Character> stack;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        stack = new Stack<>();

        while(true) {
            stack.clear();
            String str = br.readLine();

            if(str.equals(".")) {
                break;
            }

            for(int i=0; i<str.length(); i++) {
                if(str.charAt(i) == '(' || str.charAt(i) == '[') {
                    stack.push(str.charAt(i));
                }
                else if(str.charAt(i) == ')' || str.charAt(i) == ']') {
                    if(stack.isEmpty() || (str.charAt(i) == ')' && stack.peek() != '(') || (str.charAt(i) == ']' && stack.peek() != '[')){
                        stack.push(str.charAt(i));
                        break;
                    }
                    stack.pop();
                }
            }

            if(stack.empty()) {
                bw.write(YES + "\n");
            }
            else {
                bw.write(NO + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}