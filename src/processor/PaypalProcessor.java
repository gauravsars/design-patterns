package processor;

import model.PaymentRequest;

public class PaypalProcessor implements PaymentProcessor {

    @Override
    public void processPayment(PaymentRequest request) {

        System.out.println(
                "Processing payment through PayPal");
    }
}