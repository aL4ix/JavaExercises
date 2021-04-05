package ch02.ex15;

public class Ch02Ex15 {
    public static void main(String[] args) {
        System.out.println(Ch02Ex15.class.getSimpleName());
        Invoice invoice = new Invoice();
        invoice.addItem("Item 1", 1, 1);
        invoice.addItem("Item 2", 2, 2);
        invoice.addItem("Item 3", 3, 3);
        invoice.print();
    }
}
