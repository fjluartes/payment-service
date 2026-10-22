package com.example.payment_service.model;

public record PaymentResponse(
    String transactionId,
    PaymentStatus status,
    String message
) {
}
