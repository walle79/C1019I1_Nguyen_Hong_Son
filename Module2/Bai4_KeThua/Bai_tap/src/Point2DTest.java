import java.util.Scanner;

public class Point2DTest extends Point2D{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point2D point2D = new Point2D();
        System.out.print("Enter x: ");
        point2D.setX(sc.nextFloat());
        System.out.print("Enter y: ");
        point2D.setY(sc.nextFloat());
        System.out.print(point2D);

    }
}
