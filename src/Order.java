import java.util.Arrays;
import java.util.Objects;

public class Order {
    String customer;
    Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Заказ[покупатель=" + customer + ", товары=" + Arrays.toString(basket) + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        if (order.basket == null) {
            return false;
        }
        if (order.basket.length != this.basket.length) {
            return false;
        }
        for (int i = 0; i < order.basket.length; i++) {
            if (order.basket[i].equals(this.basket[i])) {
                return false;
            }
        }
        return Objects.equals(customer, order.customer);
    }
}