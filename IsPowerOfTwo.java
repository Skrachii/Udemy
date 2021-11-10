package Udemy;

class IsPowerOfTwo {

    static boolean isPower(int n) {
        int i = 1;
        while (i < n) {
            i *= 2;
        }
        return i == n;
    }

    public static void main(String[] args) {

        if(isPower(31))
           System.out.println("Yes");
       else
           System.out.println("No");
    }
}

