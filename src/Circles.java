public class Circles {
    private Circle[] circles;

    Circles() {

    }

    Circles(Circle[] circles) {
        this.circles = circles;

    }

    public void setSize(int size) {
        circles = new Circle[size];
    }

    public int getSize() {
        return circles.length;
    }

    public Circle get(int index) {
        return circles[index];
    }

    public Circle maxRadius(){
        Circle maxRadius = new Circle();
        //TODO: Add code here
        return maxRadius;
    }

    public void sortByRadius() {
        for (int i = 0; i < circles.length; i++) {
            //This sort doesn't work for all cases. How do we fix it?
            if ((i + 1) != circles.length) {
                if (circles[i].getRadius() > circles[i + 1].getRadius()) {
                    Circle temp = circles[i];
                    circles[i] = circles[i + 1];
                    circles[i + 1] = temp;
                }
            }
        }
    }

}
