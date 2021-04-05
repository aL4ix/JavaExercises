package ch03.ex14;

public class Ch03Ex14 {
    public static Runnable runnableOfRunnables(Runnable[] runnables) {
        return () -> {
            for (Runnable runnable : runnables) {
                runnable.run();
            }
        };
    }

    public static void main(String[] args) {
        System.out.println(Ch03Ex14.class.getSimpleName());
        Runnable[] runnables = new Runnable[20];
        for (int i = 0; i < runnables.length; i++) {
            Integer integer = i;
            runnables[i] = () -> System.out.printf("Task %d\n", integer);
        }
        runnableOfRunnables(runnables).run();
    }
}
