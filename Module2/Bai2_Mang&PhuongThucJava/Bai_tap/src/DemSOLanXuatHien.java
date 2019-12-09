import java.util.Scanner;

public class DemSOLanXuatHien {
    public static void main(String[] args) {
        String s;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        s = input.nextLine();
        System.out.println("Chuỗi khởi tạo là: " + s);
        char k;
        System.out.print("Enter char you want to find: ");
        k = input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==k){
                count++;
            }
        }
        System.out.println(count);
    }
}
