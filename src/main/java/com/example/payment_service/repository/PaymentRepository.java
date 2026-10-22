package com.example.payment_service.repository;

import java.util.List;

import com.example.payment_service.model.Payment;
import com.example.payment_service.model.PaymentStatus;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="payment", path="payment")
public interface PaymentRepository extends PagingAndSortingRepository<Payment, Long>, CrudRepository<Payment, Long> {
    List<Payment> findByPaymentId(@Param("id") Long id);
    List<Payment> findByPaymentType(@Param("paymentType") String paymentType);
    List<Payment> findByStatus(@Param("status") PaymentStatus status);
}
