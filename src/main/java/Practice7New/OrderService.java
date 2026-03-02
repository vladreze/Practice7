package Practice7New;

import Practice7.PaymentGatewayException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderService {

    private static final Logger log = LoggerFactory.getLogger(OrderService.class);
    public void checkout(Order order) throws PaymentGatewayException{

        try {
            log.info("Спроба оплати для замовлення: {}", order.id());
            throw new PaymentGatewayException("Connection timeout with Bank");
        } catch (PaymentGatewayException e) {
            log.error("ERROR Order ID: {}, User: {}. Причина: {}",
                    order.id(), order.userEmail(), e.getMessage());
            throw new OrderProcessingException("Не вдалося завершити оформлення замовлення", e);
        }


    }
}
