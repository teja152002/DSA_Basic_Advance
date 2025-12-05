package mypractice.practice;

import java.util.*;

public class MapProlem {
    public static void main(String[] args) {
        Map<String, Integer> currentMp = new HashMap<>(); // Current stock
        currentMp.put("MacBook",5);
        currentMp.put("iPhone",10);
        currentMp.put("AirPods",25);

        Map<String, Integer> incomingMp = new HashMap<>(); // incoming stock
        incomingMp.put("VisionPro",2);
        incomingMp.put("iPhone",5);
        incomingMp.put("AirPods",5);

        // Updating the incoming stock
        for(String product : incomingMp.keySet()) { // looping key's in incoming stock
            int qty = incomingMp.get(product);  // Taking value of each stock and storing as 'qty' which means, quantity of each stock
            currentMp.put(product, currentMp.getOrDefault(product,0) + qty);
            // we are updating the current stock using, the 'qty' means value. we need to fetch right from currentStock
            // if current stock is contains iphone or not. getOrDefault method is used to fetch key using value, if not default is 0. and upating qty
        }

        System.out.println("Updated : ");
        int toalUnits = 0; // intiliaze vaible to 0 to count number of units
        for(Map.Entry<String, Integer> m : currentMp.entrySet()) { // looping the entire current stock, which means updated stock
            System.out.println(m.getKey()+" -> " + m.getValue()); // printing the output
            toalUnits += m.getValue(); // sum of total units
        }
        System.out.println("TotalUnits : " + toalUnits);

    }
}
