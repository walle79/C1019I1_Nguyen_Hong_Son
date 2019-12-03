import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        float deposit,month;
        float per;
        java.util.Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of deposit: ");
        deposit = scanner.nextInt();
        System.out.println("Enter amount of month: ");
        month = scanner.nextInt();
        System.out.println("Enter %/year: ");
        per = scanner.nextFloat();
        float res = 0;
        for (int i = 0; i < month; i++) {
            res = deposit * per/12 * month;
            res += deposit;
        }
        System.out.println("Tổng tiền nhận được sau " + month + " tháng gửi là : " + res);
    }
}