package Udemy;

public class kphToMph {
    public static void main(String[] args) {
       double DisplayKph=ToKph(20);


    }
    public static void DispayKph(double mph, double kph){
        System.out.println(mph + "is equal to " + kph );
    }

    public static long ToKph(double MilesPerHour){
        if (MilesPerHour<0){
            return 0;
        }
        long KilometersPerHour=Math.round(MilesPerHour * 1.60);
        return KilometersPerHour;
    }
}
