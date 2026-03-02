package Practice7New;

import Practice7.PaymentGatewayException;

public class OrderProcessingException extends RuntimeException {
    public OrderProcessingException(String message, PaymentGatewayException e) {
        super(message);
    }
}
