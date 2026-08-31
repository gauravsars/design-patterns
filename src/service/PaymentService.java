package service;

import model.PaymentRequest;
import processor.strategy.PaymentProcessor;
import factory.PaymentProcessorFactory;

public class PaymentService {

    public void processPayment(
            PaymentRequest request) {
        //Identify the processor to process the request based on the payment type.
        PaymentProcessor processor =
                PaymentProcessorFactory
                        .getProcessor(
                                request.getPaymentType());

        //Process the payment request using the identified processor.
        processor.processPayment(request);
    }
}