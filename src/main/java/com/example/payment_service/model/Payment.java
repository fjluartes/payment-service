package com.example.payment_service.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Getter
@Setter
@Table(name="payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private BigDecimal amount;
    private String currency;
    private String maskedCardNumber; // last 4 digits
    private String paymentType;

    @Enumerated(EnumType.STRING)
    private PaymentStatus status;

    private String idempotencyKey;

    private Instant createdAt;
}


