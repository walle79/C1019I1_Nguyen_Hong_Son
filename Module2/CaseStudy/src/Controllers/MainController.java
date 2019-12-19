package Controllers;

import Common.FunWriteAndReadFileCSV;
import Models.House;
import Models.Room;
import Models.Services;
import Models.Villa;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MainController extends Services {

    public static void DisplayMainMenu(){
        int choose;
        Scanner sc = new Scanner(System.in);
        System.out.println( "1. Add New Services" +
                            "\n2. Show Services" +
                            "\n3. Exit" );
        System.out.print("Enter your choose: ");
        choose = sc.nextInt();
        switch (choose){
            case 1:
                addNewServices();
                break;
            case 2:

                break;
            case 3:
                System.exit(3);
                break;
            default:
                System.out.println("Invalid! Please choose again!");
                DisplayMainMenu();
                break;
        }
    }
    public static void addNewServices() {
        int choose;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add New Villa" +
                "\n2. Add New House" +
                "\n3. Add New Room" +
                "\n4. Back to Menu" +
                "\n5. Exit");
        System.out.print("Enter your choose: ");
        choose = sc.nextInt();
        switch (choose) {
            case 1:
                addNewVilla();
                DisplayMainMenu();
                break;
            case 2:
                addNewHouse();
                DisplayMainMenu();
                break;
            case 3:
                addNewRoom();
                DisplayMainMenu();
                break;
            case 4:
                DisplayMainMenu();
                break;
            case 5:
                System.exit(5);
                break;
            default:
                System.out.println("Invalid! Please choose again!");
                addNewServices();
                break;
        }


    }

    @Override
    public String showInfo() {
        return null;
    }
    public static void addNewVilla(){
        Scanner sc = new Scanner(System.in);
        Services villa = new Villa();
        System.out.print("Enter name of Service: ");
        villa.setServicesName(sc.nextLine());
        System.out.print("Enter area used: ");
        villa.setAresUsed(sc.nextDouble());
        System.out.print("Enter max of people: ");
        villa.setMaxOfPeople(sc.nextInt());
        System.out.print("Enter fee rent: ");
        villa.setFeeRent(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter type of rent (year/month/day/hour): ");
        villa.setType(sc.nextLine());
        villa.setId(UUID.randomUUID().toString().replace("-",""));
        System.out.print("Enter standard of room: ");
        ((Villa)villa).setRoomStandard(sc.nextLine());
        System.out.print("Enter other convenient: ");
        ((Villa)villa).setConvenientOther(sc.nextLine());
        System.out.print("Enter area of pool: ");
        ((Villa)villa).setPoolArea(sc.nextDouble());
        System.out.print("Enter number of floor: ");
        ((Villa)villa).setFloor(sc.nextInt());

        ArrayList<Villa> listVilla =new ArrayList<Villa>();
        listVilla.add((Villa)villa);
        FunWriteAndReadFileCSV.writeVillaToFileCsv(listVilla);
        System.out.println("\nAdd Villa: " + villa.getServicesName() + " Success!");
    }
    public static void addNewHouse(){
        Scanner sc = new Scanner(System.in);
        Services house = new House();
        System.out.print("Enter name of Service: ");
        house.setServicesName(sc.nextLine());
        System.out.print("Enter area used: ");
        house.setAresUsed(sc.nextDouble());
        System.out.print("Enter max of people: ");
        house.setMaxOfPeople(sc.nextInt());
        System.out.print("Enter fee rent: ");
        house.setFeeRent(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter type of rent (year/month/day/hour): ");
        house.setType(sc.nextLine());
        house.setId(UUID.randomUUID().toString().replace("-",""));
        System.out.print("Enter standard of room: ");
        ((House)house).setRoomStandard(sc.nextLine());
        System.out.print("Enter other convenient: ");
        ((House)house).setConvenientOther(sc.nextLine());
        System.out.print("Enter number of floor: ");
        ((House)house).setFloor(sc.nextInt());
    }
    public static void addNewRoom(){
        Scanner sc = new Scanner(System.in);
        Services room = new Room();
        System.out.print("Enter name of Service: ");
        room.setServicesName(sc.nextLine());
        System.out.print("Enter area used: ");
        room.setAresUsed(sc.nextDouble());
        System.out.print("Enter max of people: ");
        room.setMaxOfPeople(sc.nextInt());
        System.out.print("Enter fee rent: ");
        room.setFeeRent(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter type of rent (year/month/day/hour): ");
        room.setType(sc.nextLine());
        room.setId(UUID.randomUUID().toString().replace("-",""));
        System.out.print("Enter free service: ");
        ((Room)room).setFreeServices(sc.nextLine());
    }
}

