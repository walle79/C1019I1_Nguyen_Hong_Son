public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getVol(){
        return height*Math.PI*super.getRadius()*super.getRadius();
    }
    public double getSxq(){
        return 2*Math.PI*height*super.getRadius();
    }
    public double getStq(){
        return 2*Math.PI*super.getRadius()*(super.getRadius()+height);
    }
    @Override
    public String toString(){
        return "A Cylinder with height = "
                + getHeight()
                + " S xung quanh = "
                + getSxq()
                + " S toàn phần = "
                + getStq()
                + ", which is a subclass of "
                + super.toString();
    }
}
