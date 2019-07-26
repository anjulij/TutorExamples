public class Main {

    public static void main(String[] args) {
        //Calculate the area of circle
        //What's color is the circle with the largest radius

        /*
        int radius1 = 5;
        int radius2 = 3;
        String color1 = "green";
        String color2 =  "blue";
        double area1 = calculateArea(radius1);
        double area2 = calculateArea(radius2);

        */
        int doop = 0;

        Circle c1 = new Circle(5, "green");
        Circle c2 = new Circle(3,"blue");
        Circle c3 = new Circle(10,"red");

        Circle[] foo = {c3,c1,c2};
        Circles myCircles = new Circles(foo);

        myCircles.sortByRadius();

        String color = myCircles.get(myCircles.getSize()-1).getColor();

        System.out.println(color);
    }

    public static int[] setElements(int[] nums, final int INITIAL){
        // Input: an array called nums and a constant value called INITIAL
        // Output: values in array are changed to the constant value
        for(int i = 0; i < nums.length; i++){
            nums[i] = INITIAL;
        }
        return nums;
    }
}
