package com.ngo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Payment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @NotBlank(message = "Name is required")
    private String name;
    
    @NotBlank(message = "Phone number is required")
    @Size(min = 10, max = 15, message = "Phone number should be between 10 and 15 digits")
    @Pattern(regexp = "^[0-9]+$", message = "Phone number should contain only numeric digits")
    private String phone;
    
    @NotBlank(message = "Amount is required") 
    private long amount;

    public Payment() {
        // Default constructor
    }

    public Payment(long id, String name, String phone, long amount) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.amount = amount;
    }

    // Getters and setters
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payment [id=" + id + ", name=" + name + ", phone=" + phone + ", amount=" + amount + "]";
    }
}
