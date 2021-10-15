package com.polovyi.ivan.tutorial.repository;

import com.polovyi.ivan.tutorial.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<CustomerEntity, String> {

    @Query("SELECT "
            + "DISTINCT (customer) from CustomerEntity customer "
            + "JOIN FETCH "
            + "customer.purchaseTransactions purchaseTransaction "
            + "WHERE "
            + "purchaseTransaction.paymentType = :paymentType")
    List<CustomerEntity> getAllCustomersByPaymentType(String paymentType);
}
