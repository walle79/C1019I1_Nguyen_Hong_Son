import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array a: ");
        size = input.nextInt();
        int[] a = new int[size];
        int i = 0;
        while (i<size) {
            System.out.print("Enter element " + (i + 1) + " of array a: ");
            a[i] = input.nextInt();
            i++;
        }
        System.out.print("Mảng khởi tạo là: " + "\t");
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + "\t");
        }
        // Tổng số dương lẻ trong mảng
        int S = 0;
        for (int j = 0; j < a.length; j++) {
            if(a[j]%2!=0){
                S += a[j];
            }
        }
        System.out.println("\nTổng số dương lẻ trong mảng là: " + S);
        // Tìm phần tử có trong mảng
//        int k;
//        System.out.print("Enter k: ");
//        k = input.nextInt();
//        for (int j = 0; j < a.length; j++) {
//            if(a[j]==k){
//                System.out.print(k + " trong mảng ở vị trí số " + j);
//                return;
//            }
//        }
//        System.out.println("Không tìm thấy " + k + " trong mảng!");
        // Sắp xếp theo thứ tự tăng dần
        int temp = a[0];
        for (int m = 0 ; m < a.length - 1; m++) {
            for (int j = m + 1; j < a.length; j++) {
                if (a[m] > a[j]) {
                    temp = a[j];
                    a[j] = a[m];
                    a[m] = temp;
                }
            }
        }
        System.out.println("Mảng sau khi được sắp xếp là: ");
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + "\t");
        }
        int p;
        System.out.println("Enter phần tử muốn chèn: ");
        p = input.nextInt();
        // Chèn phần tử
        int [] aNew = new int[a.length+1];
        int arrIndex = a.length-1;
        boolean insert = false;
        for (int j = a.length; j >=0 ; j--) {
            if(arrIndex>-1 && a[arrIndex]>p){
                aNew[i] = a[arrIndex--];
            } else {
                if(!insert){
                    aNew[i] = p;
                    insert = true;
                } else {
                    aNew[i] = a[arrIndex--];
                }
            }
        }
        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]+"\t");
        }
    }
}

