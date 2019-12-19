import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        s = sc.nextLine();

        // chưa xong
//        for (int i = 0; i < s.length(); i++) {
//            char character = s.charAt(i);
//            if(Character.isUpperCase(character)){
//                s.toLowerCase();
//            } else {
//                s.toUpperCase();
//            }
//        }
//        System.out.println(s);

        // chuỗi đảo ngược
        StringBuffer reverse = new StringBuffer(s);
        reverse.reverse();
        System.out.println("Chuỗi đảo ngược: " + reverse);

        // in ra chuỗi hoa
        System.out.println("Chuỗi hoa: " + s.toUpperCase());

        // in ra chuỗi thường
        System.out.println("Chuỗi thường: " + s.toLowerCase());

    }
}
