package com.ab.SolidDemo.Voilation;
public class VOnlineApp {
    public static void main(String args[]){
        Flipkart flipkart=new Flipkart();
        flipkart.myWishList();
        flipkart.myOrders();
        flipkart.imgSearch(); //without Liskov principle conflict will occur
        Customer customer= new Customer();
        customer.getPaymentMethod();
        Feedback feedback= new Feedback();
        feedback.returnOrder();
        VCheckOut checkout=new VCheckOut();
        checkout.delivary();
    }
}
