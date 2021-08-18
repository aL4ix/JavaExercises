package ch04.ex06;

public class Ch04Ex06 {
    /*
    Suppose that in Section 4.2.2, “The equals Method” (page 148), the Item.equals method uses an instanceof test.
    Implement DiscountedItem.equals so that it compares only the superclass if otherObject is an Item,
    but also includes the discount if it is a DiscountedItem.
    Show that this method preserves symmetry but fails to be transitive—that is,
    find a combination of items and discounted items so that x.equals(y) and y.equals(z), but not x.equals(z).
     */
    public static void main(String[] args) {
        System.out.println(Ch04Ex06.class.getSimpleName());
        DiscountedItem x = new DiscountedItem("desc", 1.0, 1.0);
        Item y = new Item("desc", 1.0);
        DiscountedItem z = new DiscountedItem("desc", 1.0, 2.0);
        System.out.printf("x.equals(y) = %b\n", x.equals(y));
        System.out.printf("y.equals(z) = %b\n", y.equals(z));
        System.out.printf("x.equals(z) = %b\n", x.equals(z));
    }
}
