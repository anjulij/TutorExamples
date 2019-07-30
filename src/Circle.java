public class Circle {
    private int radius;
    private String color;

    /* Default constructor */
    Circle(){
    }
    /*P rogrammer defined constructor */
    Circle(int radius,  String color){
        this.radius = radius;
        this.color = color;
    }

    /* Setters will enable the programmer to change values
     *  Getters enable the programmer to retrieve those values */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    /* These are the methods that we determined that object should be able  to perform*/
    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }


}
