package design_pattren;

public class BusToRide {
    public travelling_bus busdetails(String bus){
        if(bus.equalsIgnoreCase("GOA")){
            return new goa();
        }
        else if(bus.equalsIgnoreCase("KASHMIR")){
            return new Kashmir();
        }
        else if(bus.equalsIgnoreCase("SHIMLA")){
            return new shimla();
        }
        else if(bus.equalsIgnoreCase("OOTY")){
            return new Ooty();
        }
        else{
            throw new IllegalArgumentException("INVALID OPTION :"+bus);
        }
    }
}
