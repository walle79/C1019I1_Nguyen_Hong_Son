import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int n, S=1;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter n: ");
            n = input.nextInt();
        } while (n%2 ==0);
        for (int i = 1; i <= n; i+=2) {
            S = S*i;
        }
        System.out.println("S = " + S);

    }
}
