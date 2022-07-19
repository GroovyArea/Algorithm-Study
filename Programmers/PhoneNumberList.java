package Programmers;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumberList {
    /*public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for(int i = 0; i<= phone_book.length - 1; i++){
           if(phone_book[i + 1].startsWith(phone_book[i]))
               return false;
        }

        return true;
    }*/

    public boolean solution(String[] phone_book) {
        Map<String, Integer> map = new HashMap<>();

        for(String phone_number : phone_book){
            map.put(phone_number, 1);
        }

        for(String phone_number : phone_book){
            for(int i = 0; i<phone_number.length(); i++){
                String prefix = phone_number.substring(0,i);
                if(map.containsKey(prefix)){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String[] a1 = {"123", "345", "2342342", "123"};

        System.out.println(new PhoneNumberList().solution(a1));
    }
}
