package com.springbootplayground.store;

public class OrderService {
  public void placeorder() {
    var paymentService = new StripePaymentService();
    paymentService.processPayment(10);
  }
}
