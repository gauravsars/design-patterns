package processor.strategy;

import model.PaymentRequest;

public interface PaymentProcessor {

    void processPayment(PaymentRequest request);
}