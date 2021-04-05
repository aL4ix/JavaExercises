package ch01.ex14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ch01Ex14 {
    public static boolean checkResults(int[] results) {
        System.out.println(Arrays.toString(results));
        boolean result = true;
        for (int r = 0; r < results.length - 1; r++) {
            if (results[r] != results[r + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Ch01Ex14 Give me a magic square");
        try (Scanner scan = new Scanner(System.in)) {
            ArrayList<ArrayList<Integer>> table = new ArrayList<>();
            while (true) {
                String line = scan.nextLine();
                if (line.length() == 0)
                    break;
                ArrayList<Integer> all = new ArrayList<>();
                for (String num : line.split(" ")) {
                    all.add(Integer.parseInt(num));
                }
                table.add(all);
            }
            System.out.printf("Table: %s\n", table);

            int size = table.size();
            int[] sums = new int[size];

            try {
                for (int r = 0; r < size; r++) {
                    for (int c = 0; c < size; c++) {
                        sums[r] += table.get(r).get(c);
                    }
                }
                System.out.println("Checking same sums for rows");
                ArrayList<Boolean> allChecks = new ArrayList<>();
                allChecks.add(checkResults(sums));

                int magicSum = sums[0];
                Arrays.fill(sums, 0);

                for (int c = 0; c < size; c++) {
                    for (ArrayList<Integer> integers : table) {
                        sums[c] += integers.get(c);
                    }
                }
                System.out.println("Checking same sums for columns");
                allChecks.add(checkResults(sums));

                System.out.println("Checking same sums for rows and columns");
                allChecks.add(checkResults(new int[]{magicSum, sums[0]}));

                int sum = 0;
                for (int d = 0; d < size; d++) {
                    sum += table.get(d).get(d);
                }
                System.out.println("Checking same sums for first diagonal");
                allChecks.add(checkResults(new int[]{magicSum, sum}));

                sum = 0;
                for (int d = 0; d < size; d++) {
                    sum += table.get(size - d - 1).get(d);
                }
                System.out.println("Checking same sums for second diagonal");
                allChecks.add(checkResults(new int[]{magicSum, sum}));

                System.out.printf("Is it a magic square? %B", allChecks.stream().allMatch(Boolean::booleanValue));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("NOT A SQUARE");
            }
        }
    }
}
