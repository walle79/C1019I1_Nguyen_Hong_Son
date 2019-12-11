import java.util.Scanner;

public class Point3DTest extends Point3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point3D point3D = new Point3D();
        System.out.print("Enter z: ");
        point3D.setZ(sc.nextFloat());
        System.out.println(point3D);

    }
}
