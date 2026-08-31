package com.designpatterns;

import model.PaymentRequest;
import service.PaymentService;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
	// In V4 we will create paymentRequest using builder design pattern.
        PaymentRequest request =
                new PaymentRequest(
                        "C101",
                        "RAZORPAY",
                        new BigDecimal("5000"),
                        "INR");


        PaymentService paymentService =
                new PaymentService();

        paymentService.processPayment(request);
    }
}
