package Interface_Resizeable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // lớp circle
        Scanner sc = new Scanner(System.in);
        Shape circle = new Circle();
        System.out.print("Enter radius: ");
        ((Circle)circle).setRadius(sc.nextDouble());
        sc.nextLine();
        System.out.print("Enter color: ");
        circle.setColor(sc.nextLine());
        System.out.print("Filled or not? ");
        circle.setFilled(sc.nextBoolean());
        System.out.println(circle.toString());
        System.out.print("Enter percent(%): ");
        circle.resize(sc.nextDouble());
        System.out.print("Diện tích sau khi thay đổi: ");
        System.out.println(((Circle) circle).getAreaChange());

        // lớp rectangle
        Shape rectangle = new Rectangle();
        System.out.print("Enter width: ");
        ((Rectangle)rectangle).setWidth(sc.nextDouble());
        System.out.print("Enter length: ");
        ((Rectangle)rectangle).setLength(sc.nextDouble());
        System.out.print("Enter color: ");
        rectangle.setColor(sc.nextLine());
        System.out.print("Filled or not? ");
        rectangle.setFilled(sc.nextBoolean());
        System.out.println(rectangle.toString());
        System.out.print("Enter percent(%): ");
        rectangle.resize(sc.nextDouble());
        System.out.println("Diện tích sau khi thay đổi: ");
        System.out.println(((Rectangle)rectangle).getAreaChange());

        // Mảng các hình
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        for (Shape shape:shapes) {
            System.out.println(shape.getS());
        }
        System.out.print("Random percent(%): ");
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].resize(Math.random());
        }
        System.out.println("Diện tích sau khi thay đổi: ");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(((shapes[i]).getAreaChange()));
        }
    }
}
