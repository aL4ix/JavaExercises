package ch03.ex01;

public class Employee implements Measurable {
    double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }
}
