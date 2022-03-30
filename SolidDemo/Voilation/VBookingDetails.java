package com.ab.SolidDemo.Voilation;
   //interface segrgation violation
    interface BookOrder{
        void bookingOrder();
        void getPaymentMethod();
        void returnOrder();
    }
    class Customer implements BookOrder {
        @Override
        public void bookingOrder() {
            System.out.println("I booked shoes");
        }
        @Override
        public void getPaymentMethod() {
            System.out.println("through PhonePe");
        }

        @Override
        public void returnOrder() {

        }
    }
    class Feedback implements BookOrder {

        @Override
        public void bookingOrder() {

        }

        @Override
        public void getPaymentMethod() {

        }

        @Override
        public void returnOrder() {

            System.out.println("But product is poor, I will use return policy");
        }
    }
