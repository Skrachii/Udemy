package Udemy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class EXAMPLES {
    public static void main(String[] args) {
        ArrayList<String>lists=new ArrayList<>();
    File data = new File("data.txt");
    int counter = 0;
    double sum = 0;
        try {
            Scanner input = new Scanner(data);
            while(input.hasNextLine()){
                String line=input.nextLine();
                lists.add(line);
                Scanner lineScanner= new Scanner(line);
                lineScanner.next();
                lineScanner.next();
                int t = lineScanner.nextInt();
                sum=sum+t;
                counter++;
            }
            double average= sum/counter;
            System.out.printf("Average temperature: %.2f", average);

            for (String line : lists) {
                Scanner lineScanner=new Scanner(line);
                String day = lineScanner.next();
                String date = lineScanner.next();
                int t = lineScanner.nextInt();
                if(t > average){
                    System.out.println(line);
                }

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }

    }
}