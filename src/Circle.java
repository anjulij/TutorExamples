public class Circle {
    private int radius;
    private String color;

    /*Default constructor*/
    Circle(){
    }
    /*Programmer defined constructor*/
    Circle(int radius,  String color){
        this.radius = radius;
        this.color = color;
    }
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
    public double calculateArea(){
        return radius*radius*Math.PI;
    }
    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }


}
