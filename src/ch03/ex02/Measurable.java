package ch03.ex02;

import java.util.*;

public interface Measurable {
    static Measurable largest(Measurable[] objects) {
        return Arrays.stream(objects).max(Comparator.comparing(Measurable::getMeasure)).get();
    }

    double getMeasure();

    static double average(Measurable[] objects) {
        double sum = 0;
        for (Measurable object : objects) {
            sum += object.getMeasure();
        }
        return sum / objects.length;
    }
}
