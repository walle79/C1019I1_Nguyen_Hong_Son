package Point__MoveablePoint;

import java.util.Scanner;

public class PointTest extends Point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point point = new Point();
        System.out.print("Enter x: ");
        point.setX(sc.nextFloat());
        System.out.print("Enter y: ");
        point.setY(sc.nextFloat());
        System.out.println("(x,y): "+ point);
    }
}
