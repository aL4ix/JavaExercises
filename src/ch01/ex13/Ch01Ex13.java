package ch01.ex13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ch01Ex13 {
    public static void main(String[] args) {
        System.out.println("Ch01Ex13 Lottery");
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        for (int i = 1; i <= 49; i++) {
            randomNumbers.add(i);
        }
        Random rand = new Random();
        ArrayList<Integer> results = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            Integer removed = randomNumbers.remove(rand.nextInt(randomNumbers.size()));
            results.add(removed);
        }
        Collections.sort(results);
        System.out.println(results);
    }
}
