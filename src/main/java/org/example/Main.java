package org.example;

import org.example.classes.*;


import java.util.Scanner;

public class Main {
    public static void printMenu(){
        clearScreen();
        System.out.println("Choose your payment method : ");
        System.out.println(" 1)- credit card ");
        System.out.println(" 2)- Paypal ");
        System.out.println(" 3)- GooglePay ");

    }
    public static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();

    }
    public static void main(String[] args) {
        int choice;
        do {
            printMenu();
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            Payment payment;
            double price;

            switch (choice) {
                case 1:
                    System.out.println("Enter the price to pay ");
                    //sc.nextInt();
                    price = sc.nextDouble();
                    payment = new CreditCardPayment();
                    payment.processPayment(price);
                    break;
                case 2:
                    System.out.println("Enter the price to pay ");
                    //sc.nextInt();
                    price = sc.nextDouble();
                    payment = new PaypalPayment();
                    payment.processPayment(price);
                    break;
                case 3:
                    System.out.println("Enter the price to pay ");
                    //sc.nextInt();
                    price = sc.nextDouble();
                    payment = new GooglePayPayment();
                    payment.processPayment(price);
                    break;
                default:
                    System.out.println("Choice doesn't exist you're getting out");
                    System.exit(0);
            }
        } while (choice != 0);

        //System.out.println(choice);
    }
}