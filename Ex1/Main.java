package Udemy.Ex1;

public class Main {
    public static void main(String[] args) {
        Car BMW = new Car();
        Car Merc = new Car();
        BMW.setModel("120d");
        BMW.setDoors(4);
        BMW.setColour("Red");
        BMW.setWheels(4);
        BMW.setEngine("V8");
        Merc.setModel("GLE");
        System.out.println("model is " + BMW.getModel());
        System.out.println("has " + BMW.getDoors()+" doors");
        System.out.println("the colour is " + BMW.getColour());
        System.out.println("Number of wheels- " + BMW.getWheels());
        System.out.println("Your car has " + BMW.getEngine() + " engine");
        System.out.println("Your Mercedes model is "+ Merc.getModel());
    }

}
