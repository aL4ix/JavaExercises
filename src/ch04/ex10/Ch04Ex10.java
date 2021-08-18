package ch04.ex10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Ch04Ex10 {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
        Use the MethodPrinter program in Section 4.5.1, “Enumerating Class Members”
        (page 168) to enumerate all methods of the int[] class. Extra credit if you
        can identify the one method (discussed in this chapter) that is wrongly
        described.

        Is it the equals method??? because it should be named getEquals or isEquals???
         */
        System.out.println(Ch04Ex10.class.getSimpleName());
        methodPrinter(int[].class);
    }

    static void methodPrinter(Class<?> cl) {
        while (cl != null) {
            for (Method m : cl.getDeclaredMethods()) {
                System.out.println(Modifier.toString(m.getModifiers()) + " " +
                        m.getReturnType().getCanonicalName() + " " +
                        m.getName() +
                        Arrays.toString(m.getParameters()));
            }
            cl = cl.getSuperclass();
        }
    }
}
