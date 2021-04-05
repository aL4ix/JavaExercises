package ch03.ex08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ch03Ex08 {
    public static void lucySort(List<String> strings, Comparator<String> comp) {
        while (true) {
            ArrayList<String> newList = new ArrayList<>(strings);
            Collections.shuffle(newList);
            boolean sorted = true;
            for (int i = 1; i < newList.size(); i++) {
                if (comp.compare(newList.get(i - 1), newList.get(i)) > 0) {
                    sorted = false;
                    break;
                }
            }
            if (sorted) {
                System.out.println(newList);
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Ch03Ex08.class.getSimpleName());
        lucySort(List.of("6", "3", "6", "9"), Comparator.comparing(String::toString));
    }
}
