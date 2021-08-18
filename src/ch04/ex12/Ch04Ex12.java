package ch04.ex12;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ch04Ex12 {

    public static final int ITERATIONS = 100000;

    public static void main(String[] args) {
        System.out.println(Ch04Ex12.class.getSimpleName());
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            normalMethod();
        }
        long end1 = System.currentTimeMillis();
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            reflexionMethod();
        }
        long end2 = System.currentTimeMillis();
        System.out.printf("For %d iterations\n", ITERATIONS);
        System.out.printf("normalMethod() = %dms\n", end1 - start1);
        System.out.printf("reflexionMethod() = %dms\n", end2 - start2);
    }

    static void normalMethod() {
        System.out.println("Hello");
    }

    static void reflexionMethod() {
        try {
            Field outField = System.class.getDeclaredField("out");
            Class<?> printStream = outField.getType();
            Object out = outField.get(null);
            Method println = printStream.getDeclaredMethod("println", String.class);
            println.invoke(out, "Hello");
        } catch (ReflectiveOperationException ignored) {
        }
    }
}

