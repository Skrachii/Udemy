package Udemy;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticallyOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Waiting for input...");
        String s = scan.nextLine();
        char charArray[]=s.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));
    }
}
