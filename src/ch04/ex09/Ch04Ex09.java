package ch04.ex09;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

class Simple {
    private int a;
    private Simple cyclic;

    public Simple(int a) {
        this.a = a;
        cyclic = this;
    }
}

public class Ch04Ex09 {
    public static void main(String[] args) {
        System.out.println(Ch04Ex09.class.getSimpleName());
        Simple o = new Simple(1);
        System.out.println(universalToString(o));
    }

    /*
    I think it can be improved, if i find out the way to do it
     */
    static String universalToString(Object o) {
        List<String> fields = new ArrayList<>();
        for (Field field : o.getClass().getDeclaredFields()) {
            try {
                field.trySetAccessible();
                fields.add(String.format("%s=%s", field.getName(), field.get(o)));
            } catch (IllegalAccessException ignored) {
            }
        }
        return o.getClass().getSimpleName() + "={" + String.join(",", fields) + "}";
    }
}
