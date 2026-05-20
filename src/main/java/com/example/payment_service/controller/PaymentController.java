package com.example.payment_service.controller;

import com.example.payment_service.model.Payment;
import com.example.payment_service.repository.PaymentRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.payment_service.model.PaymentStatus;

@Controller
@RequestMapping(path="/api")
public class PaymentController {
    private PaymentRepository paymentRepository;


//    @GetMapping("/status")
//    public ResponseEntity<Payment> findByStatus(@Param("status") PaymentStatus s) {
//        return ResponseEntity<Payment> ;
//    }
}
