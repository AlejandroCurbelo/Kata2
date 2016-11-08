package kata2;

import java.util.HashMap;

public class Kata2 {
    
     public static void main(String[] args) {
         
        //Double[] vector = {2.0,1.0,3.0,1.0,4.0,6.0,100.9,100.9,2.0,100.9,100.9};
        String[] vector = {"Alejandro", "Kilian", "Alguien", "Alejandro", "Alejandro"};
        
        Histogram histo = new Histogram(vector);
        
        HashMap<Object,Integer> histogram = histo.getHashMap();
        
        for(Object key : histogram.keySet()){
            System.out.println(key + " -> " + histogram.get(key));
        }
    }
}