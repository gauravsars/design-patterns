public class PaymentService {

    public void processPayment(
            PaymentRequest request) {

        if ("STRIPE".equalsIgnoreCase(
                request.getPaymentType())) {

            System.out.println(
                    "Processing payment through Stripe");

        } else if ("RAZORPAY".equalsIgnoreCase(
                request.getPaymentType())) {

            System.out.println(
                    "Processing payment through Razorpay");

        } else if ("PAYPAL".equalsIgnoreCase(
                request.getPaymentType())) {

            System.out.println(
                    "Processing payment through PayPal");

        } else {

            throw new IllegalArgumentException(
                    "Unsupported payment type");
        }
    }
}