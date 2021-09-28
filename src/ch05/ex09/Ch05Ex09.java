package ch05.ex09;

public class Ch05Ex09 {
    public static void main(String[] args) throws Exception {
        System.out.println(Ch05Ex09.class.getSimpleName());
        try (ReentrantLockResource reentrantLockResource = new ReentrantLockResource()) {
            throw new Exception("Testing even throwing an exception will close the resource");
        }
    }
}
