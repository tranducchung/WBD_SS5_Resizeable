public class Cricle extends Shape {
    private double radius = 1;

    public Cricle() {
    }

    public Cricle(double radius) {
        this.radius = radius;
    }

     public double getRadius() {
        return radius;
    }

    @Override
    public void resize(double percent) {
        this.radius = (percent/100)*getRadius()+getRadius();
    }

    @Override
    public String toString() {
        return "Cricle{" +
                " radius = " + radius +
                '}';
    }
}
