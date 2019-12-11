import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter color: ");
        String color = sc.nextLine();
        Circle circle = new Circle(radius,color);
        System.out.println(circle.toString());
        System.out.println("Enter height: ");
        double height = sc.nextDouble();
        Cylinder cylinder = new Cylinder(radius,color,height);
        System.out.println(cylinder.toString());
    }
}
