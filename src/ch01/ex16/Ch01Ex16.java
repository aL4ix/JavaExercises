package ch01.ex16;

public class Ch01Ex16 {
    public static double average(double value, double... values) {
        double sum = value;
        for (double v : values) {
            sum += v;
        }
        return sum / (values.length + 1);
    }

    public static void main(String[] args) {
        System.out.println("Ch01Ex16 Improve average()");
        System.out.println(average(5, 1));
    }
}
