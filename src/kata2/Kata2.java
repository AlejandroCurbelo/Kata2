package kata2;

import java.util.HashMap;

public class Kata2 {
    
     public static void main(String[] args) {
         
        Double[] vector = {2.0,1.0,3.0,1.0,4.0,6.0,100.9,100.9,2.0,100.9,100.9};
        
        Histogram histo = new Histogram(vector);
        
        HashMap<Double,Integer> histogram = histo.getHashMap();
        
        for(Double key : histogram.keySet()){
            System.out.println(key + " -> " + histogram.get(key));
        }
    }
}