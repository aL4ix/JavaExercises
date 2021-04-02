package Ch02.EX17;

public class Ch02Ex17 {
    public static void main(String[] args) {
        System.out.println(Ch02Ex17.class.getSimpleName());
        Queue queue = new Queue();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        Queue.Iterator iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
