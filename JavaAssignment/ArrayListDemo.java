package JavaAssignment;

import java.util.ArrayList;

public class ArrayListDemo{
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Arifa");
        names.add("shaik");
        names.add("babu");
        for(String name: names) {
            System.out.println(name);
        }
    }
}
