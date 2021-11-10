package Udemy;

import java.time.Year;

public class isLeapYear {
    public static void main(String[] args) {
        isLeapYear(2000);
    }

    public static void isLeapYear(int Year) {
        boolean leap = false;


        if (Year % 4 == 0) {
            if (Year % 100 == 0) {
                if (Year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            } else
                leap = true;
        } else {

            leap = false;
        }

        if (leap == true)
            System.out.println(Year + " is Leap Year");
        else
            System.out.println(Year + " is not leap year");
    }
}
