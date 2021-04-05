package ch02.ex07;

/**
 * Exercise 7 from Chapter 2 from the book Core Java SE 9 for the Impatient
 *
 * @author aLaix
 */
public class Ch02Ex07 {

    /**
     * @param args, it receives no arguments
     */
    public static void main(String[] args) {
        System.out.println(Ch02Ex07.class.getSimpleName());
        AccessorPoint accessorPoint = new AccessorPoint(3, 4).translate(1, 3).scale(0.5);
        System.out.println(accessorPoint);
        MutatorPoint mutatorPoint = new MutatorPoint(3, 4);
        mutatorPoint.translate(1, 3);
        mutatorPoint.scale(0.5);
        System.out.println(mutatorPoint);
    }
}
