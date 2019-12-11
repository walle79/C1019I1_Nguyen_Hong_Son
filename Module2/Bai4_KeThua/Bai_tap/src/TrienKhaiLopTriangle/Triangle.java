package TrienKhaiLopTriangle;

public class Triangle extends Shape {
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }
    public double getArea(){
        return this.side3*this.side2*(1/2);
    }
    @Override
    public String toString(){
        return super.toString() +
               " Cạnh 1: " + side1 +
               " Cạnh 2: " + side2 +
               " Cạnh 3: " + side3 +
               " S = " + getArea() +
               " P = " + getPerimeter();
    }
}
