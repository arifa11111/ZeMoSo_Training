package com.ab.SolidDemo.Voilation;

public class VCustomerRefund {
    public void rrefund() {
        System.out.println("Refund will be available soon");
        VRefundDetails r = new VRefundDetails();  //Dependency inversion Violation
        r.refund2();
    }
}
