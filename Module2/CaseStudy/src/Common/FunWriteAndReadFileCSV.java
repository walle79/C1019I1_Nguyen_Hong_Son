package Common;

import Models.Customer;
import Models.House;
import Models.Room;
import Models.Villa;
import com.opencsv.CSVWriter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.TreeSet;

public class FunWriteAndReadFileCSV {
    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';
    private static final String pathVilla = "src/data/Villa.csv";
    private static String[] headerRecordVilla = new String[]{"id", "servicesName", "aresUsed", "maxOfPeople","feeRents", "type", "roomStandard", "convenientOther", "poolArea", "floor","accompaniedService"};

    // write villa to file csv
    public static void writeVillaToFileCsv(ArrayList<Villa> arrayList) {
        try (Writer writer = new FileWriter(pathVilla);
             CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordVilla);
            for (Villa villa : arrayList) {
                csvWriter.writeNext(new String[]{
                        villa.getId(),
                        villa.getServicesName(),
                        String.valueOf(villa.getAresUsed()),
                        String.valueOf(villa.getMaxOfPeople()),
                        String.valueOf(villa.getFeeRent()),
                        villa.getType(),
                        villa.getRoomStandard(),
                        villa.getConvenientOther(),
                        String.valueOf(villa.getPoolArea()),
                        String.valueOf(villa.getFloor()),
                        villa.getAccompaniedService()

                });
            }
        } catch (IOException ex) {

        }
    }


    private static final String pathHouse = "src/data/House.csv";
    private static String[] headerRecordHouse = new String[]{"id", "servicesName", "aresUsed", "maxOfPeople","feeRents", "type", "roomStandard", "convenientOther", "floor","accompaniedService"};

    // write house to file csv
    public static void writeHouseToFileCsv(ArrayList<House> arrayList) {
        try (Writer writer = new FileWriter(pathHouse);
             CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordHouse);
            for (House house : arrayList) {
                csvWriter.writeNext(new String[]{
                        house.getId(),
                        house.getServicesName(),
                        String.valueOf(house.getAresUsed()),
                        String.valueOf(house.getMaxOfPeople()),
                        String.valueOf(house.getFeeRent()),
                        house.getType(),
                        house.getRoomStandard(),
                        house.getConvenientOther(),
                        String.valueOf(house.getFloor()),
                        house.getAccompaniedService()

                });
            }
        } catch (IOException ex) {

        }
    }

    private static final String pathRoom = "src/data/Room.csv";
    private static String[] headerRecordRoom = new String[]{"id", "servicesName", "aresUsed", "maxOfPeople","feeRents", "type", "freeServices","accompaniedService"};

    // write room to file csv
    public static void writeRoomToFileCsv(ArrayList<Room> arrayList) {
        try (Writer writer = new FileWriter(pathRoom);
             CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordRoom);
            for (Room room : arrayList) {
                csvWriter.writeNext(new String[]{
                        room.getId(),
                        room.getServicesName(),
                        String.valueOf(room.getAresUsed()),
                        String.valueOf(room.getMaxOfPeople()),
                        String.valueOf(room.getFeeRent()),
                        room.getType(),
                        room.getFreeServices(),
                        room.getAccompaniedService()

                });
            }
        } catch (IOException ex) {

        }
    }
    public static ArrayList<Villa> readFileCSVToListVilla(){
        BufferedReader br = null;
        ArrayList<Villa> listVilla = new ArrayList<Villa>();
        Path path = Paths.get(pathVilla);
        if(!Files.exists(path)){
            try{
                Writer writer = new FileWriter(pathVilla);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        try{
            String line;
            br = new BufferedReader(new FileReader(pathVilla));
         //   br.readLine(); bỏ qua dòng đầu
            while((line = br.readLine())!=null){
                String[] splitData = line.split(",");
                if(splitData[0].equals("id")){
                    continue;
                }
                Villa villa = new Villa();
                villa.setId(splitData[0]);
                villa.setServicesName(splitData[1]);
                villa.setAresUsed(Double.parseDouble(splitData[2]));
                villa.setMaxOfPeople(Integer.parseInt(splitData[3]));
                villa.setFeeRent(Integer.parseInt(splitData[4]));
                villa.setType(splitData[5]);
                villa.setRoomStandard(splitData[6]);
                villa.setConvenientOther(splitData[7]);
                villa.setPoolArea(Double.parseDouble(splitData[8]));
                villa.setFloor(Integer.parseInt(splitData[9]));
                listVilla.add(villa);
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return listVilla;
    }

    public static ArrayList<House> readFileCSVToListHouse(){
        BufferedReader br = null;
        ArrayList<House> listHouse = new ArrayList<House>();
        Path path = Paths.get(pathHouse);
        if(!Files.exists(path)){
            try{
                Writer writer = new FileWriter(pathHouse);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(pathHouse));
            br.readLine();
            while((line = br.readLine())!=null){
                String[] splitdata = line.split(",");
//                if(splitdata[0].equals("id")){
//                    continue;
//                }
                House house = new House();
                house.setId(splitdata[0]);
                house.setServicesName(splitdata[1]);
                house.setAresUsed(Double.parseDouble(splitdata[2]));
                house.setMaxOfPeople(Integer.parseInt(splitdata[3]));
                house.setFeeRent(Integer.parseInt(splitdata[4]));
                house.setType(splitdata[5]);
                house.setRoomStandard(splitdata[6]);
                house.setConvenientOther(splitdata[7]);
                house.setFloor(Integer.parseInt(splitdata[8]));
                listHouse.add(house);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return listHouse;
    }

    public static ArrayList<Room> readFileCSVToListRoom(){
        BufferedReader br = null;
        ArrayList<Room> listRoom = new ArrayList<Room>();
        Path path = Paths.get(pathVilla);
        if(!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathRoom);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try{
            String line;
            br = new BufferedReader(new FileReader(pathRoom));
            br.readLine();
            while ((line = br.readLine())!=null){
                String[] splitdata = line.split(",");
                if(splitdata[0].equals("id")){
                    continue;
                }
                Room room = new Room();
                room.setId(splitdata[0]);
                room.setServicesName(splitdata[1]);
                room.setAresUsed(Double.parseDouble(splitdata[2]));
                room.setMaxOfPeople(Integer.parseInt(splitdata[3]));
                room.setType(splitdata[4]);
                room.setFreeServices(splitdata[5]);
                room.setAccompaniedService(splitdata[6]);
                listRoom.add(room);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return listRoom;
    }

    private static final String pathCustomer = "src/data/Customer.csv";
    private static String[] headerRecordCustomer = new String[]{"id", "name", "birthday", "gender","idCardNumber","phoneNumber", "email", "typeOfCustomer", "address"};

    // write customer to file csv
    public static void writeCustomerToFileCsv(ArrayList<Customer> arrayList) {
                try (Writer writer = new FileWriter(pathCustomer);
                     CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR,
                             CSVWriter.NO_QUOTE_CHARACTER,
                             CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                             CSVWriter.DEFAULT_LINE_END)) {
                    csvWriter.writeNext(headerRecordCustomer);
                    for (Customer customer : arrayList) {
                        csvWriter.writeNext(new String[]{
                                customer.getId(),
                                customer.getName(),
                                customer.getBirthday(),
                                customer.getGender(),
                                String.valueOf(customer.getIdCardNumber()),
                                String.valueOf(customer.getPhoneNumber()),
                                customer.getEmail(),
                        customer.getTypeOfCustomer(),
                        customer.getAddress(),

                });
            }
        } catch (IOException ex) {

        }
    }

    public static ArrayList<Customer> readFileCSVToListCustomer(){
        BufferedReader br = null;
        ArrayList<Customer> listCustomer = new ArrayList<Customer>();
        Path path = Paths.get(pathCustomer);
        if(!Files.exists(path)){
            try{
                Writer writer = new FileWriter(pathCustomer);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        try{
            String line;
            br = new BufferedReader(new FileReader(pathCustomer));
            //   br.readLine(); bỏ qua dòng đầu
            while((line = br.readLine())!=null){
                String[] splitData = line.split(",");
                if(splitData[0].equals("id")){
                    continue;
                }
                Customer customer = new Customer();
                customer.setId(splitData[0]);
                customer.setName(splitData[1]);
                customer.setBirthday(splitData[2]);
                customer.setGender(splitData[3]);
                customer.setIdCardNumber(Integer.parseInt(splitData[4]));
                customer.setPhoneNumber(Integer.parseInt(splitData[5]));
                customer.setEmail(splitData[6]);
                customer.setTypeOfCustomer(splitData[7]);
                customer.setAddress(splitData[8]);
                listCustomer.add(customer);

            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return listCustomer;
    }

    // write booking to file csv
    private static final String pathBooking = "src/data/Booking.csv";
    private static String[] headerRecordBooking = new String[]{"id", "name", "birthday", "gender","idCardNumber","phoneNumber", "email", "typeOfCustomer", "address","id", "servicesName", "aresUsed", "maxOfPeople","feeRents", "type"};

    public static void writeBookingToFileCsv(ArrayList<Customer> arrayList){
    try (Writer writer = new FileWriter(pathBooking);
    CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR,
            CSVWriter.NO_QUOTE_CHARACTER,
            CSVWriter.DEFAULT_ESCAPE_CHARACTER,
            CSVWriter.DEFAULT_LINE_END)) {
        csvWriter.writeNext(headerRecordBooking);
        for (Customer customer : arrayList) {
            csvWriter.writeNext(new String[]{
                    customer.getId(),
                    customer.getName(),
                    customer.getBirthday(),
                    customer.getGender(),
                    String.valueOf(customer.getIdCardNumber()),
                    String.valueOf(customer.getPhoneNumber()),
                    customer.getEmail(),
                    customer.getTypeOfCustomer(),
                    customer.getAddress(),
                    customer.getServices().getId(),
                    customer.getServices().getServicesName(),
                    String.valueOf(customer.getServices().getAresUsed()),
                    String.valueOf(customer.getServices().getMaxOfPeople()),
                    String.valueOf(customer.getServices().getFeeRent()),
                    customer.getServices().getType()

            });
        }
    } catch (IOException ex) {

    }
}
    public static ArrayList<Customer> readFileCSVToListBooking(){
        BufferedReader br = null;
        ArrayList<Customer> listBooking = new ArrayList<Customer>();
        Path path = Paths.get(pathBooking);
        if(!Files.exists(path)){
            try{
                Writer writer = new FileWriter(pathBooking);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        try{
            String line;
            br = new BufferedReader(new FileReader(pathBooking));
            //   br.readLine(); bỏ qua dòng đầu
            while((line = br.readLine())!=null){
                String[] splitData = line.split(",");
                if(splitData[0].equals("id")){
                    continue;
                }
                Customer customer = new Customer();
                customer.setId(splitData[0]);
                customer.setName(splitData[1]);
                customer.setBirthday(splitData[2]);
                customer.setGender(splitData[3]);
                customer.setIdCardNumber(Integer.parseInt(splitData[4]));
                customer.setPhoneNumber(Integer.parseInt(splitData[5]));
                customer.setEmail(splitData[6]);
                customer.setTypeOfCustomer(splitData[7]);
                customer.setAddress(splitData[8]);
                customer.setServices(splitData[9]);

                listBooking.add(customer);
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return listBooking;
    }

    public static TreeSet<String> getAllServiceNameFromFileCsV(String path){
        BufferedReader br = null;
        TreeSet<String> res = new TreeSet<String>();
        try {
            String line;
            br = new BufferedReader(new FileReader(path));
            while (br.readLine() != null) {
                line = br.readLine();
                if(getNameServiceFromFile(line).equals("servicesName")){
                    continue;
                }
                res.add(getNameServiceFromFile(line));
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return res;
    }

    public static String getNameServiceFromFile(String csvLine){
        String name = "";
        if(csvLine != null){
            String[] splitData = csvLine.split(",");
            name = splitData[1];
        }
        return name;
    }

}
