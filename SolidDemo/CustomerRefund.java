package com.ab.SolidDemo;
//dependency inversion
public class CustomerRefund {
    private final Refund refund;
    public CustomerRefund(Refund refund){
        this.refund = refund;
    }
    private int refund() {
        refund.refund();
        return 899;
    }
}
class Refund implements RRefund{
    @Override
    public void refund() {
        System.out.println("Refund available");
    }
}
