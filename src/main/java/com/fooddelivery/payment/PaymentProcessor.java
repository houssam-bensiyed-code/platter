package com.fooddelivery.payment;

public interface PaymentProcessor {
    void pay(double amount);

    String getName();
}
