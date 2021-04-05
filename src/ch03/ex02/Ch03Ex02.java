package ch03.ex02;

public class Ch03Ex02 {
    public static void main(String[] args) {
        System.out.println(Ch03Ex02.class.getSimpleName());
        Employee employee1 = new Employee("Andreas", 1325);
        Employee employee2 = new Employee("Bart", 6526);
        Employee employee3 = new Employee("Celia", 4525);
        Employee largest = (Employee) Measurable.largest(new Employee[]{employee1, employee2, employee3});
        System.out.println(largest.getName());
    }
}
