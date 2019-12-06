import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount of element arr1: ");
        size = input.nextInt();
        int[] arr1 = new int[size];
        int i = 0;
        while(i<arr1.length){
            System.out.print("Enter element " + (i+1) + " arr1: ");
            arr1[i] = input.nextInt();
            i++;
        }
        for (int j = 0; j < arr1.length; j++) {
            System.out.print(arr1[j] + "\t");
        }
        int size2;
        Scanner input2 = new Scanner(System.in);
        System.out.print("\nEnter amount of element arr2: ");
        size2 = input2.nextInt();
        int[] arr2 = new int[size2];
        int k = 0;
        while(k<arr2.length){
            System.out.print("Enter element " + (k+1) + " arr2: ");
            arr2[k] = input2.nextInt();
            k++;
        }
        for (int j = 0; j < arr2.length; j++) {
            System.out.print(arr2[j] + "\t");
        }

        int[] arr3 = new int[size+size2];
        int d = 0;
        for (int j = 0; j < arr1.length; j++) {
            arr3[d] = arr1[j];
            d++;
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[d] = arr2[j];
            d++;
        }
        System.out.println();
        for (int j = 0; j < arr3.length; j++) {
            System.out.print(arr3[j] + "\t");
        }
    }
}
