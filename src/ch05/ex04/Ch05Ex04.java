package ch05.ex04;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ch05Ex04 {
    public static Result<ArrayList<Double>, String> readValues(String filename) {
        InputStream resourceAsStream = Ch05Ex04.class.getResourceAsStream(filename);
        if (resourceAsStream == null) {
            return Result.err(String.format("File %s not found!", filename));
        } else {
            Scanner scanner = new Scanner(resourceAsStream);
            ArrayList<Double> values = new ArrayList<>();
            while (scanner.hasNext()) {
                String next = scanner.next();
                try {
                    values.add(Double.parseDouble(next));
                } catch (NumberFormatException e) {
                    return Result.err(String.format("%s is not a number", next));
                }
            }
            return Result.ok(values);
        }
    }

    public static Result<Double, String> sumOfValues(String filename) {
        Result<Double, String> result;
        Result<ArrayList<Double>, String> values = readValues(filename);
        if (values instanceof Ok) {
            Ok<ArrayList<Double>, String> ok = (Ok<ArrayList<Double>, String>) values;
            double sum = 0;
            for (Double value : ok.getValue()) {
                sum += value;
            }
            result = Result.ok(sum);
        } else {
            Err<ArrayList<Double>, String> err = (Err<ArrayList<Double>, String>) values;
            result = Result.err(err.getError());
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Ch05Ex04.class.getSimpleName());
        Result<Double, String> result = sumOfValues("read.txt");
        if (result instanceof Ok) {
            Ok<Double, String> ok = (Ok<Double, String>) result;
            Double value = ok.getValue();
            System.out.println(value);
        } else {
            Err<Double, String> err = (Err<Double, String>) result;
            System.err.println(err.getError());
        }
    }
}
