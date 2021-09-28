package ch05.ex10;

import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ch05Ex10 {
    public static void main(String[] args) {
        System.out.println(Ch05Ex10.class.getSimpleName());


        /*
The methods of the Scanner and PrintWriter classes do not throw checked
exceptions to make them easier to use for beginning programmers. How
do you find out whether errors occurred during reading or writing?
        */
        Scanner scanner = new Scanner(System.in);
        try {
            scanner.next();
        } catch (NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }
        /*
Note that the constructors can throw checked exceptions. Why does that defeat
the goal of making the classes easier to use for beginners?
         */

        //As for Java 11 these constructors don't throw any checked exceptions though
        Scanner scanner2 = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);
    }
}
