public class Retangle extends Shape  {
    private double width = 1;
    private double height = 1;

   public Retangle(){}
    public Retangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void resize(double percent) {
        this.width = (percent/100)*getWidth() + getWidth();
        this.height = (percent/100)*getHeight() + getHeight();
    }

    @Override
    public String toString() {
        return "Retangle{" +
                "width = " + width +
                ", height = " + height +
                '}';
    }
}
