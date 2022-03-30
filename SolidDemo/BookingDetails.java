package com.ab.SolidDemo;
//interface segrgation
interface BookOrder{
    void bookingOrder();
}
interface PaymentDetails{
    void getPaymentMethod();
}
interface ReturnPolicy{
    void returnOrder();
}
class Customer implements BookOrder,PaymentDetails{
    @Override
    public void bookingOrder() {
        System.out.println("I booked shoes");
    }
    @Override
    public void getPaymentMethod() {
        System.out.println("through PhonePe");
    }
}




