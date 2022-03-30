package com.ab.SolidDemo;

public class Feedback implements ReturnPolicy {
    @Override
    public void returnOrder() {
        System.out.println("But product is poor, I will use return policy");
    }
}

