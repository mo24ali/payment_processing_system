package org.example.classes;

public class CreditCardPayment extends Payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("processing credit card payment option for the amount of " + amount);
    }
}
