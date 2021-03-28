package Ch01.Ex15;

import java.util.ArrayList;
import java.util.Scanner;

public class Ch01Ex15 {

    public static void main(String[] args) {
        System.out.println("Ch01Ex15 Store a Pascal's triangle, give me the value for n");
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            ArrayList<ArrayList<Integer>> pascal = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                pascal.add(new ArrayList<>());
                pascal.get(i).add(1);
                for (int j = 0; j < i - 1; j++) {
                    pascal.get(i).add(pascal.get(i - 1).get(j) + pascal.get(i - 1).get(j + 1));
                }
                if (i > 0) {
                    pascal.get(i).add(1);
                }
            }
            for (ArrayList<Integer> row : pascal) {
                System.out.println(row);
            }
        }
    }
}
