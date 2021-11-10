package Udemy;

public class PositiveNegativeZero {
    public static void main(String[] args) {
    CheckNumbers(0);
    }
    public static void CheckNumbers(int number){
        if (number>0){
            System.out.println("Positive");
        }
        else if (number < 0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Equal to 0");
        }
    }
}
