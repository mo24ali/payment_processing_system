package org.example.classes;

public class PaypalPayment extends Payment{


    @Override
    public void processPayment(double amount) {
        System.out.println("processing paypal paying option for the amount of " + amount);
    }
}
