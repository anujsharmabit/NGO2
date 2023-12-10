package com.ngo.service;

import com.ngo.entity.Payment;
import com.ngo.repository.DonatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

	@Autowired
    private final DonatorRepository donatorRepository;

    @Autowired
    public PaymentService(DonatorRepository donatorRepository) {
        this.donatorRepository = donatorRepository;
    }

    public Payment savePayment(Payment payment) {
        // Save the payment using the injected repository
        return donatorRepository.save(payment);
    }
}
