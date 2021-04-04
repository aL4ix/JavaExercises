package Ch03.Ex12;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Ch03Ex12 {
    public static void main(String[] args) {
        System.out.println(Ch03Ex12.class.getSimpleName());
        String pathname = System.getProperty("user.home");
        System.out.println("Give me an extension");
        Scanner scanner = new Scanner(System.in);
        String extension = scanner.nextLine();
        String[] list = new File(pathname).list((f, name) -> name.endsWith(extension));
        System.out.println(Arrays.toString(list));
    }
}
