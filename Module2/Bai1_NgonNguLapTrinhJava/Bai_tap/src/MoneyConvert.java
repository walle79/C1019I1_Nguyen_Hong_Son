import java.util.Scanner;

public class MoneyConvert {
    public static void main(String[] args) {
        float usdt;
        int rate = 23000;
        java.util.Scanner input = new Scanner(System.in);
        System.out.println("Enter USD: ");
        usdt = input.nextFloat();
        float vnd = usdt * rate;
        System.out.println("Tiền vnđ tương ứng là: " + vnd);
    }
}
