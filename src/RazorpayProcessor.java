public class RazorpayProcessor implements PaymentProcessor {

    @Override
    public void processPayment(PaymentRequest request) {

        System.out.println(
                "Processing payment through Razorpay");
    }
}
