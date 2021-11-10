package Udemy.Calculator;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator=new SimpleCalculator();
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(1);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
