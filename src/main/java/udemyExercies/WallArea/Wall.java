package udemyExercies.WallArea;

public class Wall {

    private double width;
    private double height;

    public Wall(double width, double height) {
        if (this.width > 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (this.height > 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public void finalResult() {
        System.out.println("You have set width to " + this.width + " and height to "
                            + this.height + ". Total area of your wall is " + getArea() + ".");
    }

    public double getArea() {
        return height * width;
    }

}
