package Udemy.Ex1;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();
       // if (validModel.equals("x4") || validModel.equals("120d") || validModel.equals("GLE")) {
            this.model = model;
       // } else {
      //      this.model = "unknown";
        }
   // }

    public String getModel() {
        return this.model;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getDoors() {
        return this.doors;
    }
}
