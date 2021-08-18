package ch04.ex07;

public class Ch04Ex07 {
    public static void main(String[] args) {
        System.out.println(Ch04Ex07.class.getSimpleName());
        for (Colors color : Colors.values()) {
            System.out.printf("%s r=%d g=%d b=%d\n", color.name(), color.getRed(), color.getGreen(), color.getBlue());
        }
    }
}
