package processor.strategy;

import model.PaymentRequest;

public class StripeProcessor implements PaymentProcessor {

    @Override
    public void processPayment(PaymentRequest request) {

        System.out.println(
                "Processing payment through Stripe");
    }
}