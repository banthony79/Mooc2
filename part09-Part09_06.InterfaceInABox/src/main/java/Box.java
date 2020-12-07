
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
    private ArrayList<Item> list; 
   
   
    
    
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
         for (Item item: list) {
            sum+=item.weight(); 
         }
     
    return sum; }
    
    public void add(Item item) {
        double x = this.capacity; 
        if (this.capacity - item.weight() > 0) {
            list.add(item);
            x = x + item.weight(); 
            System.out.println(x);
            this.capacity = this.capacity - x; 
            
            
        }
    }
    
    
    
    @Override 
    public String toString() {
        return "Box: " + list.size() + " items, total weight " +  this.capacity  + " kg"; 
    }
    
}
