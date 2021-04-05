package ch02.ex02;


public class Ch02Ex02 {
    public static void main(String[] args) {
        System.out.println(Ch02Ex02.class.getSimpleName());
        /*
        Scanner.nextInt() is mutator because it changes the state of the object,
        the documentation says "If the translation is successful, the scanner advances past the input that matched."
        As for Random.nextInt() it is a mutator because it's is changing the state of the object too,
        It needs to change the seed to calculate a new random number.
         */
    }
}
