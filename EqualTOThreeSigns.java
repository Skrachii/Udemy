package Udemy;

public class EqualTOThreeSigns {
    public static void main(String[] args) {
    EqualThreePlaces(3.0,3.0);
    }
    public static boolean EqualThreePlaces(double x, double y){
    if(x*1000==y*1000){
        System.out.println("Works");
        return true;
    }
    else {
        System.out.println("Doesnt work");
        return false;
    }
    }
}
