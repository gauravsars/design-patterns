public class PaymentService {

    private final PaymentProcessor processor;

    public PaymentService(PaymentProcessor processor) {
        this.processor = processor;
    }

    public void processPayment(PaymentRequest request) {

        processor.processPayment(request);
    }
}