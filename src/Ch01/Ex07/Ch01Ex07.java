package Ch01.Ex07;

import java.util.Scanner;

public class Ch01Ex07 {
    public static void main(String[] args) {
        System.out.println("Ch01Ex07 Give me two numbers between 0 and 4294967296");
        try (Scanner scanner = new Scanner(System.in)) {
            int v1 = Integer.parseUnsignedInt(scanner.nextLine()); //"4000000000"
            int v2 = Integer.parseUnsignedInt(scanner.nextLine()); //"1"
            int sum = v1 + v2;
            int sub = v1 - v2;
            int mul = v1 * v2;
            int div = Integer.divideUnsigned(v1, v2);
            int mod = Integer.remainderUnsigned(v1, v2);

            System.out.printf("Sum: %s\n", Integer.toUnsignedString(sum));
            System.out.printf("Sub: %s\n", Integer.toUnsignedString(sub));
            System.out.printf("Mul: %s\n", Integer.toUnsignedString(mul));
            System.out.printf("Div: %s\n", Integer.toUnsignedString(div));
            System.out.printf("Mod: %s\n", Integer.toUnsignedString(mod));
        }
    }
}
