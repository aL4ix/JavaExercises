package ch01.ex02;

import java.util.Scanner;

public class Ch01Ex02 {
    public static void main(String[] args) {
        System.out.println("Ch01Ex02 Give me an integer angle: ");
        try (Scanner scanner = new Scanner(System.in)) {
            int angle = scanner.nextInt();
            System.out.printf("Angle %% 360 = %s\n", angle % 360);
            System.out.printf("floodMod(Angle) = %s\n", Math.floorMod(angle, 360));
        }
    }
}
