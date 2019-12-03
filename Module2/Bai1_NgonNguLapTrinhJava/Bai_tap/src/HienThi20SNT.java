import java.util.Scanner;

public class HienThi20SNT {
    public static boolean isPrime(int b){
        for(int i=2;i<b;i++){
            if (b%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int number;
        java.util.Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        number = input.nextInt();
        int count = 0;
        int n = 2;
        String str = "";
        while (count<number){
            if(isPrime(n)){
                str += n + " ";
                count++;
            }
            n++;
        }
        System.out.println(str);
    }
}
