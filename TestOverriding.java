package Udemy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestOverriding {
    public static void main(String[] args) {
List<Integer> someNumbers = Arrays.asList(1,2,3,4,5);
        Optional<Integer> firstSquare=someNumbers.stream().map(x->x*x).filter(x->x%3==0).findFirst();
        System.out.println(firstSquare.get());

}

}