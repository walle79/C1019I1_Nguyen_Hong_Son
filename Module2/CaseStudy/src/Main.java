import Models.House;
import Models.Room;
import Models.Services;
import Models.Villa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Services[] services = new Services[3];
        services[0] = new House();
        services[1] = new Room();
        services[2] = new Villa();
        for (int i = 0; i < services.length; i++) {
            System.out.println(services[i].showInfo()+"\n");
        }
    }
}
