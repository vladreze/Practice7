package Practice7New;

import Practice7.PaymentGatewayException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainOrderCheck {
    private static final Logger log = LoggerFactory.getLogger(MainOrderCheck.class);

    static void main() {
        OrderService orderService = new OrderService();
        Order order = null;
        try {
            order = new Order(213, "vlad@", 123);
            orderService.checkout(order);
        } catch (OrderProcessingException e) {
            log.error("Помилка при обробці замовлення номер {}", (order != null) ? order.id() : "user", e);
            System.out.println("ERROR: " + e.getMessage());
        } catch (Exception e) {
            log.error("ERROR", e);
        }
    }
}
