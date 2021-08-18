package ch04.ex11;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ch04Ex11 {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println(Ch04Ex11.class.getSimpleName());
        Field outField = System.class.getDeclaredField("out");
        Class<?> printStream = outField.getType();
        Object out = outField.get(null);
        Method println = printStream.getDeclaredMethod("println", String.class);
        println.invoke(out, "Hello world");
    }
}
