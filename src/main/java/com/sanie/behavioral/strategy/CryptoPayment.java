package com.sanie.behavioral.strategy;

public class CryptoPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Cryptocurrency.");
    }
}
