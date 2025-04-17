package com.springbootplayground.store;

public class OrderService {
  public void placeorder() {
    PaymentService paymentService = new StripePaymentService();
    paymentService.processPayment(10);
  }
}
