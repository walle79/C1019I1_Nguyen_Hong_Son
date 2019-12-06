import java.util.Scanner;

public class ConvertTemperature {
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
    public static void main(String[] args) {
        int choice;
        double fahranheit;
        double celsius;
        do {
            System.out.println("Menu");
            System.out.println("\n1. F to C");
            System.out.println("\n2. C to F");
            System.out.println("\n3. Exit");
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    Scanner input1 = new Scanner(System.in);
                    System.out.println("Enter Temp: ");
                    fahranheit = input1.nextDouble();
                    System.out.println(fahrenheitToCelsius(fahranheit));
                    break;
                case 2:
                    Scanner input2 = new Scanner(System.in);
                    System.out.println("Enter Temp: ");
                    celsius = input2.nextDouble();
                    System.out.println(celsiusToFahrenheit(celsius));
                    break;
                case 3:
                    System.exit(3);
                    break;
                default:
                    break;
            }
        } while (choice != 3);

    }
}
