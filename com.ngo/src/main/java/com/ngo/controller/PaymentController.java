package com.ngo.controller;

import com.ngo.entity.Payment;
import com.ngo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PaymentController {

	
	@Autowired
    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/donate")
    public String showPaymentForm() {
        return "amount"; 
    }

    @PostMapping("/payment")
    public String savePayment(Payment payment, Model model) {
        Payment savedPayment = paymentService.savePayment(payment);
        System.out.println("paymnet done");
        model.addAttribute("message", "Payment successful! ID: " + savedPayment.getId());
        return "index"; 
    }
}
