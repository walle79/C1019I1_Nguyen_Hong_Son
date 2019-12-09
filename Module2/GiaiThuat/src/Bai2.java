import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int m;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter month: ");
            m = input.nextInt();
        } while (m<1 || m > 12);
            switch (m) {
                case 2:
                    System.out.println("Tháng có 28 hoặc 29 ngày!");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Tháng có 30 ngày!");
                    break;
                default:
                    System.out.println("Tháng có 31 ngày");
                    break;
            }
        int year;
        System.out.print("Enter a year: ");
        year = input.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf("%d is a leap year", year);
                } else {
                    System.out.printf("%d is NOT a leap year", year);
                }
            } else {
                System.out.printf("%d is a leap year", year);
            }
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
        }
    }
