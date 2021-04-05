package ch02.ex05;


public class Ch02Ex05 {
    public static void main(String[] args) {
        System.out.println(Ch02Ex05.class.getSimpleName());
        AccessorPoint accessorPoint = new AccessorPoint(3, 4).translate(1, 3).scale(0.5);
        System.out.println(accessorPoint);
    }
}
