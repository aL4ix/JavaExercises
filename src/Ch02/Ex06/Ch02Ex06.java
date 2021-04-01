package Ch02.Ex06;


public class Ch02Ex06 {
    public static void main(String[] args) {
        System.out.println(Ch02Ex06.class.getSimpleName());
        MutatorPoint mutatorPoint = new MutatorPoint(3, 4);
        mutatorPoint.translate(1, 3);
        mutatorPoint.scale(0.5);
        System.out.println(mutatorPoint);
    }
}
