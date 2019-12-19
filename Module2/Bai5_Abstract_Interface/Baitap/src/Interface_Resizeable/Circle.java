package Interface_Resizeable;

public class Circle extends Shape implements Resizeable{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "
                + getRadius()
                + " S = "
                + getArea()
                + " P = "
                + getPerimeter()
                + ", which is a subclass of "
                + super.toString();
    }
    private double area;

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public void resize(double percent) {
        area = radius*radius*Math.PI*(1+percent);
}

    @Override
    public double getS() {
        return radius * radius * Math.PI;
    }

    public double getAreaChange(){
        return area;
    }
}
