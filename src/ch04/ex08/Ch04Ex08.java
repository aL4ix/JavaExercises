package ch04.ex08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ch04Ex08 {
    class MyInnerClass {
    }

    public static void main(String[] args) {
        System.out.println(Ch04Ex08.class.getSimpleName());
        List<? extends Class<?>> classes = Arrays.asList(String[].class, ArrayList.class, MyInnerClass.class, int.class);
        for (Class<?> aClass : classes) {
            System.out.printf("getCanonicalName() = %s\n", aClass.getCanonicalName());
            System.out.printf("getSimpleName() = %s\n", aClass.getSimpleName());
            System.out.printf("getTypeName() = %s\n", aClass.getTypeName());
            System.out.printf("getName() = %s\n", aClass.getName());
            System.out.printf("toString() = %s\n", aClass.toString());
            System.out.printf("toGenericString() = %s\n", aClass.toGenericString());
        }
    }
}