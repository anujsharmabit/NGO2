package com.ngo.repository;

import com.ngo.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonatorRepository extends JpaRepository<Payment, Long> {
    // This interface already inherits CRUD methods from JpaRepository
    // You can add custom queries or methods here if needed
}
