package Ch03.Ex09;

public class Ch03Ex09 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Ch03Ex09.class.getSimpleName());
        Greeter a = new Greeter(1000, "AAA");
        Greeter b = new Greeter(1000, "BBBBB");
        new Thread(a).start();
        new Thread(b).start();
    }
}
