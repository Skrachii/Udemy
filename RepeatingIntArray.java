//package Udemy;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Map.Entry;
//
//public class RepeatingIntArray {
//    public static void main(String[] args) {
//        int[] array = new int[]{12, 0, -22, 0, 43, 545, -4, -55, 12, 43, 0, -999, -87};
//
//        // taking hashmap to accumulate corresponding couter of each number
//        HashMap<Integer, Integer> ht = new HashMap<Integer, Integer>();
//        for (Integer newNumber : array) {
//            if (ht.get(newNumber) == null) {
//                ht.put(newNumber, 1);
//            } else {
//                ht.put(newNumber, ht.get(newNumber) + 1);
//            }
//
//        }
//
//        System.out.println(ht);
//        // now iterate the map
//        for (Map.Entry<String, Integer> entry : Map.entrySet()) {
//            Integer number = entry.getKey();
//            Integer count = entry.getValue();
//            if (count > 1) {
//                System.out.println("Number: " + number + "count: " + count);
//            }
//        }
//    }
//}
