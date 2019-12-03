import java.util.Scanner;

public class ChisoBMI {
    public static void main(String[] args) {
        float weight,height;
        java.util.Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight(kg): ");
        weight = scanner.nextFloat();
        System.out.println("Enter height(m): ");
        height = scanner.nextFloat();
        float bmi = weight/(height*height);
        System.out.println("Chỉ số BMI là: " + bmi);
        if(bmi < 18.5){
            System.out.println("Underweight!");
        } else if (bmi < 25) {
            System.out.println("Normail!");
        } else if (bmi < 30) {
            System.out.println("Overweight!");
        } else {
            System.out.println("Obese!");
        }
    }
}
