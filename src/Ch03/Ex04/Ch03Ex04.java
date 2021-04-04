package Ch03.Ex04;

public class Ch03Ex04 {
    public static void main(String[] args) {
        System.out.println(Ch03Ex04.class.getSimpleName());
        IntSequence sequence = IntSequence.of(1, 2, 3);
        while (sequence.hasNext()) {
            System.out.println(sequence.next());
        }
    }
}
