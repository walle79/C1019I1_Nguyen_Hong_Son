import java.util.Scanner;

public class DelElementArray {
    public static void main(String[] args) {
        int[] arrNum = new int[10];
        arrNum[0] = 10;
        arrNum[1] = 4;
        arrNum[2] = 6;
        arrNum[3] = 7;
        arrNum[4] = 8;
        arrNum[5] = 6;
        for (int i = 0; i < arrNum.length; i++) {
            System.out.print(arrNum[i]+"\t");
        }
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the number you want to del: ");
        x = input.nextInt();
        int i = 0;
        for (i = 0; i < arrNum.length; i++) {
            if (arrNum[i] == x) {
                System.out.println("Find x at: " + i);
                break;
            }
        }
        int index_del = i;
        for (int j = index_del; j < arrNum.length - 1; j++) {
            arrNum[j] = arrNum[j+1];
        }
        System.out.println("Mảng mới sau khi xóa là: ");
        for (int j = 0; j < arrNum.length; j++) {
            System.out.print(arrNum[j]+"\t");
        }
    }
}
