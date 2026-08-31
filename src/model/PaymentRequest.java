package model;

import java.math.BigDecimal;

public class PaymentRequest {

    private String customerId;
    private String paymentType;
    private BigDecimal amount;
    private String currency;

    public PaymentRequest(
            Builder builder) {

        this.customerId = builder.customerId;
        this.paymentType = builder.paymentType;
        this.amount = builder.amount;
        this.currency = builder.currency;
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

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String customerId;
        private String paymentType;
        private BigDecimal amount;
        private String currency;

        public Builder customerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        public Builder amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public PaymentRequest build() {
            return new PaymentRequest(this);
        }
    }

}