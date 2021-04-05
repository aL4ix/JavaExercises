package ch02.ex15;


import java.util.ArrayList;

public class Invoice {
    private static class Item {
        String description;
        int quantity;
        double unitPrice;

        double getPrice() {
            return quantity * unitPrice;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "description='" + description + '\'' +
                    ", quantity=" + quantity +
                    ", unitPrice=" + unitPrice +
                    '}';
        }
    }

    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(String description, int quantity, double unitPrice) {
        Item newItem = new Item();
        newItem.description = description;
        newItem.quantity = quantity;
        newItem.unitPrice = unitPrice;
        items.add(newItem);
    }

    public void print() {
        double total = 0;
        for (Item item : items) {
            System.out.println(item);
            total += item.getPrice();
        }
        System.out.printf("Total: %f\n", total);
    }
}
