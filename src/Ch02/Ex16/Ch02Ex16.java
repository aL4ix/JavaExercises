package Ch02.Ex16;

public class Ch02Ex16 {
    public static void main(String[] args) {
        System.out.println(Ch02Ex16.class.getSimpleName());
        Queue queue = new Queue();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue);
    }
}
