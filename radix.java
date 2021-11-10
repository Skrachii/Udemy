package Udemy;

import java.util.ArrayList;

public class radix {
    public static void main(String[] args) {


        Integer i1 = Integer.parseInt("16", 16);
        Integer i2 = 2;
        Integer i3 = Integer.parseInt("3");

        ArrayList<Integer> ial = new ArrayList<>();
        ial.add(i1);
        ial.add(i2);
        ial.add(i3);


        System.out.println(ial);
    }
}
