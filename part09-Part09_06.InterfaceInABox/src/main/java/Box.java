
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brycelooyenga
 */
public class Box implements Packable {
    
    private double capacity; 
    private ArrayList<Packable> list; 
   
   
    
    
    public Box(double capacity) {
      
        this.capacity = capacity; 
       
        this.list = new ArrayList<>();
        
    }
    
    public double originalWeight(){
        final double originalWeight = this.capacity; 
        return originalWeight; 
    }
    
     public double weight() {
         double sum = 0; 
         for (Packable item: list) {
            sum+=item.weight(); 
         }
     
    return sum; }
    
     public void add(Packable item) {
        double remainingWeight = (this.capacity - weight()); 
       if (item.weight() < remainingWeight) { 
           list.add(item); 
          
       }

    }
    
    
    
    @Override 
    public String toString() {
        return "Box: " + list.size() + " items, total weight " +  String.format("%.1f", weight())  + " kg"; 
    }
    
}
