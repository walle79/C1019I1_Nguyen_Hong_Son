import java.util.Scanner;

public class DemSoSVPass {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = input.nextInt();
            if(size>30){
                System.out.println("Can't exceed 30");
            }
        } while (size >30);
        array = new int[size];
        int i = 0;
        while (i<array.length){
            System.out.println("Enter mark of student " + (i+1)+": ");
            array[i] = input.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("List of mark: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
            if(5<=array[j]&&array[j]<=10){
                count++;
            }
        }
        System.out.println("Amount SV Pass: " + count);
    }
}
