package Practice7New;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class ReceiptWriter implements AutoCloseable{
    private static final Logger log = LoggerFactory.getLogger(ReceiptWriter.class);
    public void writeReceipt(String content) throws IOException {
        log.info("Запис чека: " + content);
        throw new IOException("RECIEPT WTITTER ERROR");
    }

    @Override
    public void close() {
        log.info("MEthod ReciptWriter Closed");

    }
}
