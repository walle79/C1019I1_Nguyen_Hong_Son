package Common;

import java.util.Scanner;

public class Validation {
    private static String regex = "";
    private static Scanner sc;

    // check name service valid
    public static boolean checkNameService(String str){
        regex = "^[A-Z]{1}[a-z]{1,}|(\\s{1}([A-Z]{1}[a-z]{1,}){1,})$";
        return str.matches(regex);
    }
    // check name customer valid
    public static boolean NameException(String str){
        regex = "^(([\\p{Lu}][\\p{Ll}]+)|(([\\p{Lu}][\\p{Ll}]+)(\\s([\\p{Lu}][\\p{Ll}]+)){1,6}))$";
        return str.matches(regex);
    }
    // check mail customer valid
    public static boolean emailException(String str){
        regex = "^([A-Z]|[a-z]|[1-9]){1,}@([A-Z]|[a-z]|[1-9]){3,6}\\.([A-Z]|[a-z]|[1-9]){3,6}$";
        return str.matches(regex);
    }
    // gender
    public static boolean genderException(String str){
        regex = "^(Male|Female|Unknow)$";
        return str.matches(regex);
    }
    // id card number
    public static boolean IdCardException(String str){
        regex = "^[0-9]{9}";
        return str.matches(regex);
    }
    public static boolean BirthdayException(String str){
        regex = "^((0[1-9])|([1-2][0-9])|(3[0|1]))\\/((0[1-9])|(1[0-2]))\\/((19[6-9][0-9])|(200[0-2]))$";
        return str.matches(regex);
    }

    public static boolean checkAccompaniedService(String str){
        regex = "^(Message|Karaoke|Food|Drink|Car)$";
        return str.matches(regex);
    }

    public static boolean checkTypeOfRent(String str){
        regex = "^(Hour|Day|Month|Year)$";
        return str.matches(regex);
    }

    public static double checkValidNumberDouble(String content, String errMes){
        while (true) {
            try{
                sc = new Scanner(System.in);
                System.out.println(content);
                return sc.nextDouble();
            } catch (Exception e) {
                System.out.println(errMes);
            }
        }
    }

    public static Integer checkValidNumberInteger(String content, String errMes){
        while (true) {
            try {
                sc = new Scanner(System.in);
                System.out.println(content);
                return sc.nextInt();
            } catch (Exception e){
                System.out.println(errMes);
            }
        }
    }
}
