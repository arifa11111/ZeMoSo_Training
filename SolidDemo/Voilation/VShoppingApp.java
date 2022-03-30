package com.ab.SolidDemo.Voilation;
public abstract class VShoppingApp {
        public abstract void myWishList();
        public abstract void imgSearch();
        public  void myOrders(){
            //open closed principle violation
            System.out.println("We can't modify it will create disturbance");
        }

    }
    class Amazon extends VShoppingApp {
        @Override
        public void myWishList() {
            System.out.println("I have footwear,dresses in my wishlist in Amazon");
        }
        @Override
        public void imgSearch() {
            System.out.println("Amazon has Image Search feature in Amazon");
        }
    }
    class Flipkart extends VShoppingApp {
        @Override
        public void myWishList() {
            System.out.println("I have sarees,T-shirts in my wishlist in flipkart");
        }
        //Liskov Substitution violation
        @Override
        public void imgSearch() {
            throw new RuntimeException("This feature doesn't exists in flipkart");
        }
    }

