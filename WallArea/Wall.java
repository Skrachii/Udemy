package Udemy.WallArea;

public class Wall {
    private double width;
    private double height;

   public Wall(){

   }

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
        if(width<0){
           this.width=0;
        }
        if(height<0){
            this.height=0;
        }
    }

    public double setArea(){
       return width*height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

