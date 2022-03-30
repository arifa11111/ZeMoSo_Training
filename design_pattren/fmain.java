package design_pattren;

import java.util.Scanner;

class Travel_Agency {
    public static void main(String... args){
        BusToRide obj= new BusToRide();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter destination :");
        String bus = sc.nextLine();
        travelling_bus p = obj.busdetails(bus);
        p.passinger_status();
    }
}
