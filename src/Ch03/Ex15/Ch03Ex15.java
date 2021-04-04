package Ch03.Ex15;

import java.util.Arrays;
import java.util.Comparator;

public class Ch03Ex15 {
    public static void main(String[] args) {
        System.out.println(Ch03Ex15.class.getSimpleName());
        Employee[] employees = new Employee[]{
                new Employee("AAA", 10),
                new Employee("BBB", 10),
                new Employee("AAA", 15),
                new Employee("BBB", 5),
        };
        Arrays.sort(employees, Comparator.comparing(Employee::getMeasure).thenComparing(Employee::getName));
        System.out.println(Arrays.toString(employees));
    }
}
