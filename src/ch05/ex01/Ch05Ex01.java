package ch05.ex01;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ch05Ex01 {
    public static ArrayList<Double> readValues(String filename) throws FileNotFoundException {
        InputStream resourceAsStream = Ch05Ex01.class.getResourceAsStream(filename);
        if (resourceAsStream == null)
            throw new FileNotFoundException(String.format("File %s not found!", filename));
        Scanner scanner = new Scanner(resourceAsStream);
        ArrayList<Double> result = new ArrayList<>();
        while (scanner.hasNext()) {
            String next = scanner.next();
            result.add(Double.parseDouble(next));
        }
        return result;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(Ch05Ex01.class.getSimpleName());
        System.out.println(readValues("read.txt"));
    }
}
