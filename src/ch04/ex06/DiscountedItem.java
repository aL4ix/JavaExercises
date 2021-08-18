package ch04.ex06;

import java.util.Objects;

public class DiscountedItem extends Item {
    private double discount;

    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        boolean result = true;
        if (o instanceof DiscountedItem) {
            DiscountedItem that = (DiscountedItem) o;
            result = Double.compare(that.discount, discount) == 0;
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discount);
    }
}
