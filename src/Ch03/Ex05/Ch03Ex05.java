package Ch03.Ex05;

public class Ch03Ex05 {
    public static void main(String[] args) {
        System.out.println(Ch03Ex05.class.getSimpleName());
        IntSequence constant = IntSequence.constant(1);
        for (int i = 0; i < 10; i++) {
            System.out.println(constant.next());
        }
    }
}
