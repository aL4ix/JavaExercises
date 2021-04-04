package Ch03.Ex01;

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
