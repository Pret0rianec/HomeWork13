//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {
    Product product1 = new Product(1234, "SW UltraMega", 999, "Smart watch");
    Product product2 = new Product(1324, "myPhone Super13", 1999, "Smart phone");
    Product product3 = new Product(0, "", 0, "");
    Product product4 = new Product(1324, "myPhone Super13", 1999, "Smart phone");
    System.out.println("Product list:");
    System.out.println(product1);
    System.out.println(product2);
    System.out.println(product3);
    System.out.println("Product comparison:");
    System.out.println("product1 vs product2: " + product1.equals(product2));
    System.out.println("product2 vs product3: " + product2.equals(product3));
    System.out.println("product3 vs product1: " + product3.equals(product1));
    System.out.println("product2 vs product4: " + product2.equals(product4));
    Product[] basket1 = {product1, product2};
    Product[] basket2 = {product2, product3};
    Order order1 = new Order("", basket1);
    Order order2 = new Order("Strive Green", basket1);
    Order order3 = new Order("Strive Green", basket1);
    System.out.println("Order list:");
    System.out.println(order1);
    System.out.println(order2);
    System.out.println("Order comparison:");
    System.out.println("order1 vs order2: " + order1.equals(order2));
    System.out.println("order2 vs order3: " + order2.equals(order3));
}
