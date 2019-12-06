import java.util.Scanner;

public class FindMinValue__ {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount of array: ");
        size = input.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while(i<arr.length){
            System.out.print("Enter element " + (i+1) +" : ");
            arr[i] = input.nextInt();
            i++;
        }
        System.out.println("Mảng khởi tạo là: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        int min = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        System.out.println("\nMin value is: " + min);
    }
}
