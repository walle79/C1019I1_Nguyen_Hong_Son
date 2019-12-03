import java.util.Scanner;

public class Kiemtranamnhuan {
    public static void main(String[] args) {
        int year;
        java.util.Scanner input = new Scanner(System.in);
        System.out.println("Enter year: ");
        year = input.nextInt();
        if(year%4 == 0 && year%100!=0){
            System.out.println(year + " là năm nhuận!");
        } else if(year%100==0 && year%400==0){
            System.out.println(year + " là năm nhuận!");
        } else {
            System.out.println(year + " không phải năm nhuận!");
        }
    }
}
