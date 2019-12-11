package Point__MoveablePoint;

import java.util.Scanner;

public class MoveablePointTest extends MoveablePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.print("Enter xSpeed: ");
        moveablePoint.setxSpeed(sc.nextFloat());
        System.out.print("Enter ySpeed: ");
        moveablePoint.setySpeed(sc.nextFloat());
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
