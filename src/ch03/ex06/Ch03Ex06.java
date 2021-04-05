package ch03.ex06;

import java.util.Scanner;

public class Ch03Ex06 {
    public static void main(String[] args) {
        System.out.println(Ch03Ex06.class.getSimpleName());
        Scanner scanner = new Scanner(System.in);
        SquareSequence squareSequence = new SquareSequence();
        while (squareSequence.hasNext()) {
            System.out.println(squareSequence.next());
            System.out.println("Press ENTER");
            scanner.nextLine();
        }
    }
}
