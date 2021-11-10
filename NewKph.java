package Udemy;

public class NewKph {
    public static void main(String[] args) {
    PrintConversion(20);
    }

    public static long ToKmph(double MilesPerHour) {
        if (MilesPerHour < 0) {
            return -1;
        }
        return Math.round(MilesPerHour * 1.60);
    }

    public static void PrintConversion(double MilesPerHour) {
        if (MilesPerHour < 0) {
            System.out.println("Invalid value");
        } else {
            long Kph=ToKmph(MilesPerHour);
            System.out.println(MilesPerHour + "mi/h=" + Kph + "km/h");
        }
    }
}
