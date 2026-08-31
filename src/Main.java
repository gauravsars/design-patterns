import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        PaymentRequest request =
                new PaymentRequest(
                        "C101",
                        "STRIPE",
                        new BigDecimal("5000"),
                        "INR");

        PaymentService paymentService =
                new PaymentService();

        paymentService.processPayment(request);
    }
}
