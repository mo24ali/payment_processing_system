package org.example.classes;

public class GooglePayPayment extends Payment{


    @Override
    public void processPayment(double amount) {
        System.out.println("processing google pay option for the amount of " + amount);
    }
}
