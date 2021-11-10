package Udemy;

public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(ShouldWakeUp(false, 23));
    }

    public static boolean ShouldWakeUp(boolean barking, int HourOfDay) {
        if (HourOfDay < 0 || HourOfDay > 23) {
            return false;
        } else if (barking == true && HourOfDay < 8 || HourOfDay > 22) {
            System.out.println("Събуждане, защото лае през нощта//true");
            return true;
        } else if (barking == true && HourOfDay > 8 || HourOfDay < 22) {
            System.out.println("Не ставаш, защото лае в позволено време//false");
            return false;
        } else if (barking == false && HourOfDay < 8 || HourOfDay > 22) {
            System.out.println("Кучето не лае");
            return false;
        } else if (barking == false && HourOfDay > 8 || HourOfDay < 22) {
            System.out.println("Кучето не лае");
            return false;
        }
        return false;
    }
}