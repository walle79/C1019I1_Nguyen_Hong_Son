import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        System.out.println("Tính tổng và tính các chữ số của 1 số nguyên!");
        int n, soDu, tong = 0, tich = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương bất kỳ: ");
        n = scanner.nextInt();
        while (n > 0) {
            soDu = n % 10;
            n = n / 10;
            tong += soDu;
            tich *= soDu;
        }
        System.out.println("Tích các chữ số = " + tich);
        System.out.println("Tổng các chữ số = " + tong);
    }
}
