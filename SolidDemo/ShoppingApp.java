package com.ab.SolidDemo;
public abstract class ShoppingApp{
    public abstract void myWishList();
    public abstract void myOrders();
    //open closed principle
}
abstract class UpdateFeatures extends ShoppingApp{
    //Liskov Substitution
    public abstract void imgSearch();

}
class Amazon extends UpdateFeatures{
    @Override
    public void myWishList() {
        System.out.println("I have footwear,dresses in my wishlist in Amazon");
    }
    @Override
    public void myOrders() {
        System.out.println("I ordered handbag in Amazon");
    }
    @Override
    public void imgSearch() {
        System.out.println("Amazon has Image Search feature in Amazon");
    }
}
class Flipkart extends ShoppingApp{
    @Override
    public void myWishList() {
        System.out.println("I have sarees,T-shirts in my wishlist in flipkart");
    }
    @Override
    public void myOrders() {
        System.out.println("I ordered jumpsuits in flipkart");
    }
}

