package Udemy;

public class HasEqualSum {
    public static void main(String[] args) {
        hasEqualSum(1, 1, 2);
    }

    public static boolean hasEqualSum(int a, int b, int c) {
        if (a + b == c) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
        }
        return false;
    }
}
