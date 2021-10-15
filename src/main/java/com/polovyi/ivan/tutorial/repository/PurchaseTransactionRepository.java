package com.polovyi.ivan.tutorial.repository;

import com.polovyi.ivan.tutorial.entity.PurchaseTransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseTransactionRepository extends JpaRepository<PurchaseTransactionEntity, String> {

}
