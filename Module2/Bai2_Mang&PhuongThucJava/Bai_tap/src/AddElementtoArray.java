import java.util.Scanner;

public class AddElementtoArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 10;
        array[1] = 4;
        array[2] = 6;
        array[3] = 7;
        array[4] = 8;
        System.out.println("Mảng khởi tạo là: ");
        for (int i = 0; array.length > i; i++) {
            System.out.print(array[i] + "\t");
        }
        int x;
        int index;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the num you want to add: ");
        x = input.nextInt();
        System.out.print("Enter the index of num: ");
        index = input.nextInt();
        if (index < 0 || index > array.length - 1) {
            System.out.println("Can't add to Array!");
        } else {
            for (int i = array.length-1; i >index; i--) {
                array[i] = array[i-1];
            }
            array[index] = x;
            System.out.println("Mảng mới sau khi thêm là: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + "\t");
            }
        }
    }
}




