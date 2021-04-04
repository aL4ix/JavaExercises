package Ch03.Ex10;

public class Ch03Ex10 {
    public static void runTogether(Runnable... tasks) {
        for (Runnable task : tasks) {
            new Thread(task).start();
        }
    }

    public static void runInOrder(Runnable... tasks) {
        for (Runnable task : tasks) {
            task.run();
        }
    }
    public static void main(String[] args) {
        System.out.println(Ch03Ex10.class.getSimpleName());
        Runnable[] runnables = new Runnable[20];
        for (int i = 0; i < runnables.length; i++) {
            Integer integer = i;
            runnables[i] = () -> System.out.printf("Task %d\n", integer);
        }
        System.out.println("IN ORDER");
        runInOrder(runnables);
        System.out.println("TOGETHER");
        runTogether(runnables);
    }
}
