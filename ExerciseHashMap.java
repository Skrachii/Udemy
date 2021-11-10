package Udemy;

import java.util.HashMap;

public class ExerciseHashMap {
    public static void main(String[] args) {
        HashMap <String, String> phoneBook = new HashMap<>();
        phoneBook.put("Stefan", "111111111");
        phoneBook.put("Vladi", "222222222");
        phoneBook.put("Emo", "333333333");

        for (String name: phoneBook.keySet()) {
            System.out.printf("%s: %s: \n" ,name,phoneBook.get(name));

        }
    }
}
