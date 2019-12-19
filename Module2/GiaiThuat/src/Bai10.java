import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String string = sc.nextLine();

        // in mỗi từ trên mỗi dòng
        System.out.println("In mỗi từ trên mỗi dòng: ");
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }

        // đếm số từ
        System.out.println("Số từ trong chuỗi đã nhập: " + string.length());

        // đếm số lần xuất hiện
        System.out.println("Bảng tần số: ");
//        int[] statistics = new int[256];
//        for(int i = 0;i < string.length(); i ++) {
//            char c = string.charAt(i);
//            statistics[(int)c] ++;
//        }
//        for (int i = 0; i < statistics.length; i++) {
//            if(statistics[i] != 0){
//                System.out.print(statistics[i]+" ");
//            }
//        }
        char[] kytu = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            c = kytu[i];
        }
        for (int i = 0; i < kytu.length; i++) {
            System.out.print(kytu[i]);
        }
    }
}
