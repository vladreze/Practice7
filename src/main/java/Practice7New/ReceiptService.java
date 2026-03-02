package Practice7New;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;

public class ReceiptService {
    private static final Logger log = LoggerFactory.getLogger(ReceiptService.class);

    public void generate(String receiptData) {
        try (ReceiptWriter writer = new ReceiptWriter()) {
            writer.writeReceipt(receiptData);
        } catch (IOException e) {
            log.error("Помилка при спробі надрукувати чек: {}", receiptData);
            throw new ReceiptGenerationException("Помилка генерації фіскального документа", e);
        }
    }
}