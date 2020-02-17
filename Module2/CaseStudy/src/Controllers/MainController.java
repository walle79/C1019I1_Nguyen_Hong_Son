package Controllers;

import Common.FunWriteAndReadFileCSV;
import Common.Validation;
import Models.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class MainController extends Services {
    private static ArrayList<Villa> listVilla = new ArrayList<Villa>();
    private static ArrayList<House> listHouse = new ArrayList<House>();
    private static ArrayList<Room> listRoom =new ArrayList<Room>();
    private static ArrayList<Customer> listCustomer = new ArrayList<Customer>();
    private static ArrayList<Customer> listBooking = new ArrayList<Customer>();


    public static void DisplayMainMenu(){
        int choose;
        Scanner sc = new Scanner(System.in);
        System.out.println( "1. Add New Services" +
                        "\n2. Show Services" +
                        "\n3. Add New Customer" +
                        "\n4. Show Infomation Customer" +
                        "\n5. Add New Booking Resort" +
                        "\n6. Show Infomation Employee" +
                        "\n7. Exit" );
                System.out.print("Enter your choose: ");
                choose = sc.nextInt();
                switch (choose){
                    case 1:
                        addNewServices();
                        break;
                    case 2:
                        showServices();
                        break;
                    case 3:
                        addNewCustomer();
                        DisplayMainMenu();
                        break;
                    case 4:
                        showInfoCustomer();
                        DisplayMainMenu();
                        break;
                    case 5:
                        addNewBookingResort();
                        DisplayMainMenu();
                        break;
                    case 6:
                        showInfoEmployee();
                        DisplayMainMenu();
                        break;
                    case 7:
                        System.exit(7);
                        break;
                    default:
                        System.out.println("Invalid! Please choose again!");
                        DisplayMainMenu();
                        break;
        }
    }

    private static void showInfoEmployee() {
        HashMap<String, Employee> hashMap = new HashMap<String, Employee>();
        hashMap.put("1",new Employee("Nguyễn Văn A", 18, "Đà Nẵng"));
        hashMap.put("2",new Employee("Ngô Ngọc Văn", 20, "Huế"));
        hashMap.put("3",new Employee("Nguyễn Hồng Sơn", 25, "Quảng Nam"));
        hashMap.put("4",new Employee("Nguyễn Văn An", 30, "Phú Yên"));
        hashMap.put("5",new Employee("Nguyễn Văn Toàn", 17, "Hội An"));
        hashMap.put("6",new Employee("Nguyễn Thị Định", 29, "Gia Lai"));
        hashMap.put("7",new Employee("Lương Kiên", 21, "Quảng Trị"));
        hashMap.put("8",new Employee("Trần Phúc", 43, "Quảng Bình"));
        hashMap.put("9",new Employee("Lê Lộc", 24, "Nghệ An"));
        hashMap.put("10",new Employee("Quách Phú Thành", 26, "Hà Tĩnh"));

        Set<String> keySet = hashMap.keySet();
        for (String key : keySet) {
            System.out.println(key + " " + hashMap.get(key));
        }
        System.out.println("--------------");
    }


    private static void addNewBookingResort() {
        Scanner sc = new Scanner(System.in);
        listCustomer = FunWriteAndReadFileCSV.readFileCSVToListCustomer();
        Collections.sort(listCustomer, new SortNameAndYear());
        int i = 1;
        for (Customer customer : listCustomer) {
            System.out.println("No " + i + " " + customer.showInfo());
            i++;
        }
        System.out.print("Choose customer you want to book: ");
        Customer customer = listCustomer.get(sc.nextInt()-1);
        System.out.println("\n1. Booking Villa" +
                            "\n2. Booking House" +
                            "\n3. Booking Room");
        System.out.print("Choose you want to book: ");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                ArrayList<Villa> listVillas = FunWriteAndReadFileCSV.readFileCSVToListVilla();
                int j = 1;
                for (Villa villa: listVillas) {
                    System.out.println("No " + j + " " + villa.showInfo());
                    j++;
                }
                System.out.print("Choose villa you want to book: ");
                Villa villa = listVillas.get(sc.nextInt()-1);
                customer.setServices(villa);
                ArrayList<Customer> listBooking = FunWriteAndReadFileCSV.readFileCSVToListBooking();
                listBooking.add(customer);
                FunWriteAndReadFileCSV.writeBookingToFileCsv(listBooking);
                System.out.println("\nAdd booking for: " + customer.getName() + " successful!");
                sc.nextLine();
                DisplayMainMenu();
                break;
            case 2:
                ArrayList<House> listHouses = FunWriteAndReadFileCSV.readFileCSVToListHouse();
                int k = 1;
                for (House house: listHouses) {
                    System.out.println("No " + k + " " + house.showInfo());
                    k++;
                }
                System.out.print("Choose house you want to book: ");
                House house = listHouses.get(sc.nextInt()-1);
                customer.setServices(house);
                listBooking = FunWriteAndReadFileCSV.readFileCSVToListBooking();
                listBooking.add(customer);
                FunWriteAndReadFileCSV.writeBookingToFileCsv(listBooking);
                System.out.println("\nAdd booking for: " + customer.getName() + " successful!");
                sc.nextLine();
                DisplayMainMenu();
                break;
            case 3:
                ArrayList<Room> listRooms = FunWriteAndReadFileCSV.readFileCSVToListRoom();
                int m = 1;
                for (Room room: listRooms) {
                    System.out.println("No " + m + " " + room.showInfo());
                    m++;
                }
                System.out.print("Choose room you want to book: ");
                Room room = listRooms.get(sc.nextInt()-1);
                customer.setServices(room);
                listBooking = FunWriteAndReadFileCSV.readFileCSVToListBooking();
                listBooking.add(customer);
                FunWriteAndReadFileCSV.writeBookingToFileCsv(listBooking);
                System.out.println("\nAdd booking for: " + customer.getName() + " successful!");
                sc.nextLine();
                DisplayMainMenu();
                break;
            default:
                addNewBookingResort();
                break;
        }
    }


    private static void showInfoCustomer() {
        listCustomer = FunWriteAndReadFileCSV.readFileCSVToListCustomer();
        Collections.sort(listCustomer, new SortNameAndYear());
        for (Customer customer : listCustomer) {
            System.out.println(customer.showInfo());
        }
    }

    private static void addNewCustomer() {
        listCustomer = FunWriteAndReadFileCSV.readFileCSVToListCustomer();
        Scanner sc = new Scanner(System.in);
        Customer customer = new Customer();
        // name customer
        System.out.print("Enter name of customer: ");
        customer.setName(sc.nextLine());
        while (!Validation.NameException(customer.getName())) {
            System.out.println("Tên Khách hàng phải in hoa ký tự đầu tiên trong mỗi từ! Try Again");
            System.out.print("Enter name of customer: ");
            customer.setName(sc.nextLine());
        }
        // birth day
        System.out.print("Enter customer birthday: ");
        customer.setBirthday(sc.nextLine());
        while (!Validation.BirthdayException(customer.getBirthday())){
            System.out.println("Năm sinh phải >1900 và nhỏ hơn năm hiện tại 18 năm, đúng định dạng dd/mm/yyyy! Please try again!");
            System.out.println("Enter customer birthday: ");
            customer.setBirthday(sc.nextLine());
        }
        // gender
        System.out.print("Enter gender: ");
        customer.setGender(sc.nextLine());
        String gender = customer.getGender();
        gender = gender.substring(0,1).toUpperCase() + gender.substring(1).toLowerCase();
        while (!Validation.genderException(gender)){
            System.out.println("Gender is Male, Female or Unknow! Please try again!");
            System.out.print("Enter gender: ");
            customer.setGender(sc.nextLine());
            gender = customer.getGender();
            gender = gender.substring(0,1).toUpperCase()+gender.substring(1).toLowerCase();
        }
        customer.setGender(gender);
        // id card number
        System.out.print("Enter iD card number: ");
        customer.setIdCardNumber(sc.nextInt());
        while (!Validation.IdCardException(String.valueOf(customer.getIdCardNumber()))){
            System.out.println("Id card number phải bao gồm 9 số! Please try again");
            System.out.print("Enter iD card number: ");
            customer.setIdCardNumber(sc.nextInt());
        }

        // id
        customer.setId(UUID.randomUUID().toString().replace("-",""));
        System.out.print("Enter customer phone number: ");
        customer.setPhoneNumber(sc.nextInt());
        sc.nextLine();
        // mail customer
        System.out.print("Enter mail of customer: ");
        customer.setEmail(sc.nextLine());
        while (!Validation.emailException(customer.getEmail())) {
            System.out.println("Email phải đúng định dạng abc@abc.abc! Try Again");
            System.out.print("Enter mail of customer: ");
            customer.setEmail(sc.nextLine());
        }

        System.out.print("Enter type of customer: ");
        customer.setTypeOfCustomer(sc.nextLine());
        System.out.println("Enter customer address: ");
        customer.setAddress(sc.nextLine());
        System.out.println("Enter service which customer use: ");
        customer.setServices(sc.nextLine());

        listCustomer.add(customer);
        FunWriteAndReadFileCSV.writeCustomerToFileCsv(listCustomer);
        System.out.println("\nAdd Customer: " + customer.getName() + " Success!");
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
                DisplayMainMenu();
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
        String content = "";
        String errMes = "";
        listVilla = FunWriteAndReadFileCSV.readFileCSVToListVilla();
        Scanner sc = new Scanner(System.in);
        Services villa = new Villa();
        // name service
        System.out.print("Enter name of Service: ");
        villa.setServicesName(sc.nextLine());
        while (!Validation.checkNameService(villa.getServicesName())) {
            System.out.println("Name is Invalid! Try Again");
            System.out.print("Enter name of Service: ");
            villa.setServicesName(sc.nextLine());
        }
        // area used
        content = "Enter area Used: ";
        errMes = "Invalid ( Must be a double and > 30). Try Again!";
        villa.setAresUsed(Validation.checkValidNumberDouble(content,errMes));
        while (villa.getAresUsed()<=30){
            System.out.println(errMes);
            villa.setAresUsed(Validation.checkValidNumberDouble(content,errMes));
        }
        // max people
        System.out.print("Enter max of people: ");
        villa.setMaxOfPeople(sc.nextInt());
        while (villa.getMaxOfPeople()<0 || villa.getMaxOfPeople()>20){
            System.out.print("Enter max of people (0-20): ");
            villa.setMaxOfPeople(sc.nextInt());
        }
        // fee rent
        System.out.print("Enter fee rent: ");
        villa.setFeeRent(sc.nextInt());
        while (villa.getFeeRent()<=0){
            System.out.println("Enter fee rent (must be > 0): ");
            villa.setFeeRent(sc.nextInt());
        }
        sc.nextLine();
        // type rent
        System.out.print("Enter type of rent (Year/Month/Day/Hour): ");
        villa.setType(sc.nextLine());
        while (!Validation.checkTypeOfRent(villa.getType())) {
            System.out.println("Type of rent is Invalid! Try Again");
            System.out.print("Enter type of rent (Year/Month/Day/Hour): ");
            villa.setType(sc.nextLine());
        }
        // id
        villa.setId(UUID.randomUUID().toString().replace("-",""));
        // room standard
        System.out.print("Enter standard of room: ");
        ((Villa)villa).setRoomStandard(sc.nextLine());
        while (!Validation.checkNameService(((Villa) villa).getRoomStandard())) {
            System.out.println("Name is Invalid! Try Again");
            System.out.print("Enter standard of room: ");
            ((Villa) villa).setRoomStandard(sc.nextLine());
        }
        // other convenient
        System.out.print("Enter other convenient: ");
        ((Villa)villa).setConvenientOther(sc.nextLine());
        // area pool
        ((Villa) villa).setPoolArea(Validation.checkValidNumberDouble(content,errMes));
        while (((Villa) villa).getPoolArea()<=30){
            System.out.println(errMes);
            ((Villa) villa).setPoolArea(Validation.checkValidNumberDouble(content,errMes));
        }
        // floor
        System.out.print("Enter number of floor: ");
        ((Villa)villa).setFloor(sc.nextInt());
        while (((Villa) villa).getFloor()<=0){
            System.out.print("Enter number of floor (must be > 0): ");
            ((Villa)villa).setFloor(sc.nextInt());
        }
        // Accompanied service
        System.out.println("Enter accompanied service: ");
        villa.setAccompaniedService(sc.nextLine());
        while (!Validation.checkAccompaniedService(villa.getAccompaniedService())) {
            System.out.println("Accompanied Service is Invalid! Try Again");
            System.out.print("Enter name of Accompanied Service: ");
            villa.setAccompaniedService(sc.nextLine());
        }

        listVilla.add((Villa)villa);
        FunWriteAndReadFileCSV.writeVillaToFileCsv(listVilla);
        System.out.println("\nAdd Villa: " + villa.getServicesName() + " Success!");
    }
    public static void addNewHouse(){
        String content ="";
        String errMes = "";
        listHouse = FunWriteAndReadFileCSV.readFileCSVToListHouse();
        Scanner sc = new Scanner(System.in);
        Services house = new House();
        // name service
        System.out.print("Enter name of Service: ");
        house.setServicesName(sc.nextLine());
        while (!Validation.checkNameService(house.getServicesName())) {
            System.out.println("Name is Invalid! Try Again");
            System.out.print("Enter name of Service: ");
            house.setServicesName(sc.nextLine());
        }
        // area used
        content = "Enter area Used: ";
        errMes = "Invalid ( Must be a double and > 30). Try Again!";
        house.setAresUsed(Validation.checkValidNumberDouble(content,errMes));
        while (house.getAresUsed()<=30){
            System.out.println(errMes);
            house.setAresUsed(Validation.checkValidNumberDouble(content,errMes));
        }
        // max people
        System.out.print("Enter max of people: ");
        house.setMaxOfPeople(sc.nextInt());
        while (house.getMaxOfPeople()<0 || house.getMaxOfPeople()>20){
            System.out.print("Enter max of people (0-20): ");
            house.setMaxOfPeople(sc.nextInt());
        }
        // fee rent
        System.out.print("Enter fee rent: ");
        house.setFeeRent(sc.nextInt());
        while (house.getFeeRent()<=0){
            System.out.println("Enter fee rent (must be > 0): ");
            house.setFeeRent(sc.nextInt());
        }
        sc.nextLine();
        // type rent
        System.out.print("Enter type of rent (Year/Month/Day/Hour): ");
        house.setType(sc.nextLine());
        while (!Validation.checkTypeOfRent(house.getType())) {
            System.out.println("Type of rent is Invalid! Try Again");
            System.out.print("Enter type of rent (Year/Month/Day/Hour): ");
            house.setType(sc.nextLine());
        }
        // id
        house.setId(UUID.randomUUID().toString().replace("-",""));
        // room standard
        System.out.print("Enter standard of room: ");
        ((House)house).setRoomStandard(sc.nextLine());
        while (!Validation.checkNameService(((House) house).getRoomStandard())) {
            System.out.println("Name is Invalid! Try Again");
            System.out.print("Enter standard of room: ");
            ((House) house).setRoomStandard(sc.nextLine());
        }
        // other convenient
        System.out.print("Enter other convenient: ");
        ((House)house).setConvenientOther(sc.nextLine());
        // floor
        System.out.print("Enter number of floor: ");
        ((House)house).setFloor(sc.nextInt());
        while (((House) house).getFloor()<=0){
            System.out.print("Enter number of floor (must be > 0): ");
            ((House)house).setFloor(sc.nextInt());
        }
        // Accompanied service
        System.out.println("Enter accompanied service: ");
        house.setAccompaniedService(sc.nextLine());
        while (!Validation.checkAccompaniedService(house.getAccompaniedService())) {
            System.out.println("Accompanied Service is Invalid! Try Again");
            System.out.print("Enter name of Accompanied Service: ");
            house.setAccompaniedService(sc.nextLine());
        }


        listHouse.add((House) house);
        FunWriteAndReadFileCSV.writeHouseToFileCsv(listHouse);
        System.out.println("\nAdd House: " + house.getServicesName() + " Success!");
    }
    public static void addNewRoom(){
        String content = "";
        String errMes = "";
        listRoom = FunWriteAndReadFileCSV.readFileCSVToListRoom();
        Scanner sc = new Scanner(System.in);
        Services room = new Room();
        // name service
        System.out.print("Enter name of Service: ");
        room.setServicesName(sc.nextLine());
        while (!Validation.checkNameService(room.getServicesName())) {
            System.out.println("Name is Invalid! Try Again");
            System.out.print("Enter name of Service: ");
            room.setServicesName(sc.nextLine());
        }
        // area used
        content = "Enter area Used: ";
        errMes = "Invalid ( Must be a double and > 30). Try Again!";
        room.setAresUsed(Validation.checkValidNumberDouble(content,errMes));
        while (room.getAresUsed()<=30){
            System.out.println(errMes);
            room.setAresUsed(Validation.checkValidNumberDouble(content,errMes));
        }
        // max people
        System.out.print("Enter max of people: ");
        room.setMaxOfPeople(sc.nextInt());
        while (room.getMaxOfPeople()<0 || room.getMaxOfPeople()>20){
            System.out.print("Enter max of people (0-20): ");
            room.setMaxOfPeople(sc.nextInt());
        }
        // fee rent
        System.out.print("Enter fee rent: ");
        room.setFeeRent(sc.nextInt());
        while (room.getFeeRent()<=0){
            System.out.println("Enter fee rent (must be > 0): ");
            room.setFeeRent(sc.nextInt());
        }
        sc.nextLine();
        // type rent
        System.out.print("Enter type of rent (Year/Month/Day/Hour): ");
        room.setType(sc.nextLine());
        while (!Validation.checkTypeOfRent(room.getType())) {
            System.out.println("Type of rent is Invalid! Try Again");
            System.out.print("Enter type of rent (Year/Month/Day/Hour): ");
            room.setType(sc.nextLine());
        }
        // id
        room.setId(UUID.randomUUID().toString().replace("-",""));
        // free service
        System.out.print("Enter free service: ");
        ((Room)room).setFreeServices(sc.nextLine());
        // Accompanied service
        System.out.println("Enter accompanied service: ");
        room.setAccompaniedService(sc.nextLine());
        while (!Validation.checkAccompaniedService(room.getAccompaniedService())) {
            System.out.println("Accompanied Service is Invalid! Try Again");
            System.out.print("Enter name of Accompanied Service: ");
            room.setAccompaniedService(sc.nextLine());
        }


        listRoom.add((Room) room);
        FunWriteAndReadFileCSV.writeRoomToFileCsv(listRoom);
        System.out.println("\nAdd Room: " + room.getServicesName() + " Success!");
    }

    public static void showServices(){
        int choose;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n1. Show All Villa " +
                           "\n2. Show All House " +
                           "\n3. Show All Room " +
                           "\n4. Show All Name Villa Not Duplicate" +
                           "\n5. Show All Name House Not Duplicate" +
                           "\n6. Show All Name Name Not Duplicate" +
                           "\n7. Back to Menu" +
                           "\n8. Exit");
        System.out.print("Enter your choose: ");
        choose = sc.nextInt();
        switch (choose){
            case 1:
                showAllVilla();
                DisplayMainMenu();
                break;
            case 2:
                showAllHouse();
                DisplayMainMenu();
                break;
            case 3:
                showAllRoom();
                DisplayMainMenu();
                break;
            case 4:
                showAllNameVillaNoDuplicate();
                break;
            case 5:
                showAllNameHouseNoDuplicate();
                break;
            case 6:
                showAllNameRoomNoDuplicate();
                break;
            case 7:
                DisplayMainMenu();
                break;
            case 8:
                System.exit(8);
                DisplayMainMenu();
                break;
            default:
                System.out.println("Invalid! Please choose again!");
                showServices();
                break;
        }
    }

    private static void showAllNameHouseNoDuplicate() {
        Scanner sc = new Scanner(System.in);
        String pathHouse = "src/Data/House.csv";
        Path path = Paths.get(pathHouse);
        if(!Files.exists(path)){
            System.out.println("File House does not exist!");
        } else {
            TreeSet<String> listHouseTreeSet = FunWriteAndReadFileCSV.getAllServiceNameFromFileCsV(pathHouse);
            System.out.println("List all name house not duplicate: ");
            for(String str : listHouseTreeSet){
                System.out.println(str);
                System.out.println("------------------");
            }
        }
        sc.nextLine();
        DisplayMainMenu();
    }

    private static void showAllNameRoomNoDuplicate() {
        Scanner sc = new Scanner(System.in);
        String pathRoom = "src/Data/Room.csv";
        Path path = Paths.get(pathRoom);
        if(!Files.exists(path)){
            System.out.println("File Room does not exist!");
        } else {
            TreeSet<String> listRoomTreeSet = FunWriteAndReadFileCSV.getAllServiceNameFromFileCsV(pathRoom);
            System.out.println("List all name room not duplicate: ");
            for(String str : listRoomTreeSet){
                System.out.println(str);
                System.out.println("------------------");
            }
        }
        sc.nextLine();
        DisplayMainMenu();
    }

    private static void showAllNameVillaNoDuplicate() {
        Scanner sc = new Scanner(System.in);
        String pathVilla = "src/Data/Villa.csv";
        Path path = Paths.get(pathVilla);
        if(!Files.exists(path)){
            System.out.println("File Villa does not exist!");
        } else {
            TreeSet<String> listVillaTreeSet = FunWriteAndReadFileCSV.getAllServiceNameFromFileCsV(pathVilla);
            System.out.println("List all name villa not duplicate: ");
            for(String str : listVillaTreeSet){
                System.out.println(str);
                System.out.println("------------------");
            }
        }
        sc.nextLine();
        DisplayMainMenu();
    }

    public static void showAllVilla(){
        listVilla = FunWriteAndReadFileCSV.readFileCSVToListVilla();
        for (Villa villa : listVilla) {
            System.out.println(villa.showInfo());
        }
    }

    public static void showAllHouse(){
        listHouse = FunWriteAndReadFileCSV.readFileCSVToListHouse();
        for (House house: listHouse) {
            System.out.println(house.showInfo());
        }
    }

    public static void showAllRoom(){
        listRoom = FunWriteAndReadFileCSV.readFileCSVToListRoom();
        for (Room room: listRoom) {
            System.out.println(room.showInfo());
        }
    }
}

