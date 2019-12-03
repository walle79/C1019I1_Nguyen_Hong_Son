import java.util.Scanner;

public class DayinMonth {
    public static void main(String[] args) {
        int month;
        java.util.Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Month: ");
        month = scanner.nextInt();
        switch (month){
            case 2:
                System.out.println("28 or 29 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("31 days");
                break;
        }
    }
}
