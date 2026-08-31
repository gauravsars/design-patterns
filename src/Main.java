import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        PaymentRequest request =
                new PaymentRequest(
                        "C101",
                        "STRIPE",
                        new BigDecimal("5000"),
                        "INR");

        PaymentProcessor processor =
                new StripeProcessor();

        PaymentService paymentService =
                new PaymentService(processor);

        paymentService.processPayment(request);
    }
}
