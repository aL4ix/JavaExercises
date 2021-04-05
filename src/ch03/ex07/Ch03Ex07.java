package ch03.ex07;

import java.util.Iterator;

class DigitSequence implements Iterator<Integer> {
    private int num;

    public DigitSequence(int num) {
        this.num = num;
    }

    @Override
    public boolean hasNext() {
        return num != 0;
    }

    @Override
    public Integer next() {
        int digit = num % 10;
        num /= 10;
        return digit;
    }

    public void remove() {
    }
}

public class Ch03Ex07 {
    private static int getJavaVersion() {
        String version = System.getProperty("java.version");
        if(version.startsWith("1.")) {
            version = version.substring(2, 3);
        } else {
            int dot = version.indexOf(".");
            if(dot != -1) { version = version.substring(0, dot); }
        } return Integer.parseInt(version);
    }

    public static void main(String[] args) {
        System.out.println(Ch03Ex07.class.getSimpleName());
        DigitSequence digitSequence = new DigitSequence(1234567890);
        digitSequence.remove();
        while (digitSequence.hasNext()) {
            System.out.println(digitSequence.next());
        }

        if (getJavaVersion() >= 8) {
            digitSequence = new DigitSequence(1234567890);
            digitSequence.forEachRemaining(System.out::println);
        }

        /*
        javac --release 7 -d . Ch03Ex07.java
        jar cfe jar.jar Ch03.Ex07.Ch03Ex07 Ch03/Ex07/*.class

        Coded for Java 7, compiled for Java 7, it does execute remove (which does nothing)
        Coded for Java 7, compiled for Java 9, it does execute remove (which does nothing)
        Coded for Java 7, compiled for Java 7 in a JAR, it does execute remove (which does nothing)
        Coded for Java 9, compiled for Java 9, it does execute both remove (which does nothing) and forEachRemaining
         */
    }
}
