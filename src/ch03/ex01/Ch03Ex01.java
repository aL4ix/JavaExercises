package ch03.ex01;

public class Ch03Ex01 {
    public static void main(String[] args) {
        System.out.println(Ch03Ex01.class.getSimpleName());
        Employee employee1 = new Employee(1325);
        Employee employee2 = new Employee(6526);
        Employee employee3 = new Employee(4525);
        System.out.println(Measurable.average(new Employee[] {employee1, employee2, employee3}));
    }
}
