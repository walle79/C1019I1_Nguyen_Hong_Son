package TrienKhaiLopTriangle;

import java.util.Scanner;

public class TriangleTest extends Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle triangle = new TriangleTest();
        System.out.print("Enter side1: ");
        triangle.setSide1(sc.nextDouble());
        System.out.print("Enter side2: ");
        triangle.setSide2(sc.nextDouble());
        System.out.print("Enter side3: ");
        triangle.setSide3(sc.nextDouble());
        sc.nextLine();
        System.out.print("Enter color of triangle: ");
        triangle.setColor(sc.nextLine());
        System.out.println(triangle.toString());
    }
}
