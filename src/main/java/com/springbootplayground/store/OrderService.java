package com.springbootplayground.store;

public class OrderService {
  private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

  public void placeorder() {
    paymentService.processPayment(10);
  }
}
