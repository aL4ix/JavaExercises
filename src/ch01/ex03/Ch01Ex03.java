package ch01.ex03;

import java.util.Scanner;

public class Ch01Ex03 {
    public static void main(String[] args) {
        System.out.println("Ch01Ex03 Give me three integers");
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int max1 = a > b ? a : b;
            max1 = max1 > c ? max1 : c;
            System.out.printf("Max using ? = %d\n", max1);
            int max2 = Math.max(Math.max(a, b), c);
            System.out.printf("Max using max() = %d\n", max2);
        }
    }
}
