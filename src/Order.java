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
        if ((basket == null && order.basket == null) || (customer == null && order.customer == null)) {
            return true;
        }
        if ((order.basket == null && basket != null) || (basket == null && order.basket != null)) {
            return false;
        }
        if (order.basket.length != basket.length) {
            return false;
        }

        for (int i = 0; i < basket.length; i++) {
            if ((basket[i] == null && order.basket[i] == null) || (basket[i] != null && order.basket[i] != null)) {
                continue;
            }
            if ((basket[i] != null && order.basket[i] == null) || (basket[i] == null && order.basket[i] != null)) {
                return false;
            }
            if (!basket[i].equals(order.basket[i])) {
                return false;
            }
        }
        return Objects.equals(customer, order.customer);
    }
}