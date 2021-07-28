import java.util.Map;
import java.util.WeakHashMap;

public class WeakHMap {

    public static void main(String[] args) {

        Map<Order,Integer> orderPriceMap = new WeakHashMap<>();

        orderPriceMap.put(new Order(123,"dbdjhjdjj"),100);
        orderPriceMap.put(new Order(456,"fgfjjj"),200);
        orderPriceMap.put(new Order(789,"abbxxx"),300);

        Order order = new Order(788,"jfkjfjnnj");  // strong reference

        orderPriceMap.put(order,400);

        System.out.println(orderPriceMap.size());

        System.gc();

        System.out.println(orderPriceMap.size());
    }
}

class Order
{
    int orderId;
    String orderDetails;

    public Order(int orderId, String orderDetails) {
        this.orderId = orderId;
        this.orderDetails = orderDetails;
    }
}
