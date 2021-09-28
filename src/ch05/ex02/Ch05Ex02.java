package ch05.ex02;

import ch05.ex01.Ch05Ex01;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Ch05Ex02 {
    public static double sumOfValues(String filename) throws FileNotFoundException {
        ArrayList<Double> values = Ch05Ex01.readValues(filename);
        double sum = 0;
        for (Double value : values) {
            sum += value;
        }
        return sum;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(Ch05Ex02.class.getSimpleName());
        System.out.println(sumOfValues("read.txt"));
    }
}
