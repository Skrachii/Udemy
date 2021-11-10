package Udemy;

public class mphTOkph {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(20));

    }

    public static long toMilesPerHour(double kilometersPerHour) {

        if(kilometersPerHour<1){
            return 0;
        }


        long milesPerHour=Math.round(kilometersPerHour/1.609);
        return milesPerHour;
    }
}