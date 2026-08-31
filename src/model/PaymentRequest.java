package model;

import java.math.BigDecimal;

public class PaymentRequest {

    private String customerId;
    private String paymentType;
    private BigDecimal amount;
    private String currency;

    public PaymentRequest(
            String customerId,
            String paymentType,
            BigDecimal amount,
            String currency) {

        this.customerId = customerId;
        this.paymentType = paymentType;
        this.amount = amount;
        this.currency = currency;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }
}