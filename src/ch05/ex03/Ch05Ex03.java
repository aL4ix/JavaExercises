package ch05.ex03;

import ch05.ex02.Ch05Ex02;

import java.io.FileNotFoundException;

public class Ch05Ex03 {
    public static void main(String[] args) {
        System.out.println(Ch05Ex03.class.getSimpleName());
        try {
            double sum = Ch05Ex02.sumOfValues("read.txt");
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("File contains non-numeric characters");
            System.err.println(e.getMessage());
        }
    }
}
