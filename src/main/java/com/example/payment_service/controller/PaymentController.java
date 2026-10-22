package com.example.payment_service.controller;

import com.example.payment_service.repository.PaymentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/api/payments")
public class PaymentController {
    private PaymentRepository paymentRepository;

}
