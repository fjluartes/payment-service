package com.example.payment_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import com.example.payment_service.model.PaymentStatus;

@Entity
@Getter
@Setter
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long paymentId;

    private String billType;
    private float currentAmount;
    private float outstandingBalance;
    private LocalDate endDate;
    private PaymentStatus status;
}
