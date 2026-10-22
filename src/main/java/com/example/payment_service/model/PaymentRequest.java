package com.example.payment_service.model;

import java.math.BigDecimal;

public record PaymentRequest (
    BigDecimal amount,
    String currency,
    String cardNumber,
    String expiryMonth,
    String expiryYear,
    String cvv,
    String cardholderName,
    String paymentType
) {
}
