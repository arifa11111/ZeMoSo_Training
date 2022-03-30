package com.ab.SolidDemo;

public class OnlineApp {
        public static void main(String args[]){
            Flipkart flipkart=new Flipkart();
            flipkart.myWishList();
            flipkart.myOrders();
            Customer customer= new Customer();
            customer.getPaymentMethod();
            Checkout checkout=new Checkout();
            checkout.delivery();
            Transportation transportation =new Transportation();
            transportation.parcel();
            Feedback feedback= new Feedback();
            feedback.returnOrder();



        }
    }
