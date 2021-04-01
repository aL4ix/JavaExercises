package Ch02.Ex09;

class Car {
    private double position;
    private final double fuelEfficiencyKmPerLiter;
    private double gasTank;

    public Car(double fuelEfficiencyKmPerLiter) {
        this.fuelEfficiencyKmPerLiter = fuelEfficiencyKmPerLiter;
    }

    boolean drive(double kilometers) {
        boolean stillHasGas;
        double usedGas = kilometers / fuelEfficiencyKmPerLiter;
        if (usedGas < gasTank) {
            position += kilometers;
            stillHasGas = true;
        } else {
            position += gasTank * fuelEfficiencyKmPerLiter;
            gasTank = 0;
            stillHasGas = false;
        }
        return stillHasGas;
    }

    void addGasoline(double liters) {
        gasTank += liters;
    }

    @Override
    public String toString() {
        return "Car{" +
                "position=" + position +
                '}';
    }
}

public class Ch02Ex09 {
    public static void main(String[] args) {
        System.out.println(Ch02Ex09.class.getSimpleName());
        Car car = new Car(15);
        car.addGasoline(20);
        System.out.printf("Does car still has gas? %B\n", car.drive(65));
        System.out.println(car);
        /*
        It could be both mutable or immutable, depends on what you are going to use it.
         */
    }
}
