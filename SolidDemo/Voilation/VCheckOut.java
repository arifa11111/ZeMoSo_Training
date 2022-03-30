package com.ab.SolidDemo.Voilation;

public class VCheckOut {
        public void delivary(){
            System.out.println("Delivery between 3-4 days");
            transportation();   //single responsibility violation
        }
        public void transportation(){
            System.out.println("Through sara express");
        }
    }

