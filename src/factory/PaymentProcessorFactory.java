package factory;

import processor.strategy.PaymentProcessor;
import processor.strategy.PaypalProcessor;
import processor.strategy.RazorpayProcessor;
import processor.strategy.StripeProcessor;

public class PaymentProcessorFactory {

    public static PaymentProcessor getProcessor(
            String paymentType) {

        return switch (paymentType.toUpperCase()) {

            case "STRIPE" ->
                    new StripeProcessor();

            case "RAZORPAY" ->
                    new RazorpayProcessor();

            case "PAYPAL" ->
                    new PaypalProcessor();

            default ->
                    throw new IllegalArgumentException(
                            "Unsupported payment type: "
                                    + paymentType);
        };
    }
}