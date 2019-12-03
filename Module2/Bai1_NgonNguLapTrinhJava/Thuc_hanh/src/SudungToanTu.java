import java.util.Scanner;

public class SudungToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        java.util.Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = scanner.nextFloat();
        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        float res = width*height;
        System.out.println("Area = " + res);
    }
}