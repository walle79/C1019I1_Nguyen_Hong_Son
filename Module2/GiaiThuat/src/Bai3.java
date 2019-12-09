import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        System.out.println("Chương trình tính S = 1 + 1/2 + 1/3 + ... + 1/n");
        float S=0;
        int n;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter n: ");
            n = input.nextInt();
        } while (n<1);
        for (int i = 1; i <= n; i++) {
            S = S + (float)1/i;
        }
        System.out.println("Tổng cần tính là S = 1 + 1/2 + 1/3 + ... + 1/n là: " + S);
    }
}
