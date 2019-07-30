public class Main {

    public static void main(String[] args) {
        /* What's color is the circle with the largest area? */

        /* Approach 1: hard code solution for two circles
         * Problem: This is very specific to one problem and makes it harder to isolate where potential bugs can occur
         * Also, unnecessarily calculates the area when we just need the largest radius*/

        int radius1 = 5;
        int radius2 = 3;
        String color1 = "green";
        String color2 = "blue";

        double area1 = calculateArea(radius1);
        double area2 = calculateArea(radius2);

        if (area1 > area2) {
            System.out.printf("The circle with the largest area %s", color1);
        } else {
            System.out.printf("The circle with the largest area is %s", color2);
        }

        /* Approach 2 and 3: Create objects for generic circles*/
        Circle c1 = new Circle(5, "green");
        Circle c2 = new Circle(3, "blue");
        Circle c3 = new Circle(10, "red");

        Circle[] circleArray = {c3, c1, c2};
        Circles myCircles = new Circles(circleArray);

        /* Approach 2: sort circles by radius and pick the last one
         * Problem: this is costly and unnecessary because swapping takes extra memory and time */
        myCircles.sortByRadius();
        System.out.printf("The circle  with the largest radius is %s", myCircles.get(myCircles.getSize() - 1).getColor());

        /* Approach 3: iterate through array storing the maximum value */
        //TODO: create this function
    }

    public static double calculateArea(int radius) {
        //Input: the radius of a circle
        //Output: the area of a circle
        return radius * radius * Math.PI;
    }

    public static int[] setElements(int[] nums, final int INITIAL) {
        // Input: an array called nums and a constant value called INITIAL
        // Output: values in array are changed to the constant value
        for (int i = 0; i < nums.length; i++) {
            nums[i] = INITIAL;
        }
        return nums;
    }
}
