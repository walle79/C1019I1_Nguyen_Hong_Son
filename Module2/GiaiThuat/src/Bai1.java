import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of line: ");
        n = input.nextInt();
        for (int i = 1; i <= n ; i++) {
            System.out.println("*****");
        }
    }
}
