
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
public class BoxWithMaxWeight extends Box {
    
    private int capacity;
    
    private ArrayList<Item> items; 
     
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity; 
        this.items = new ArrayList<>(); 
        
    }
    
    public void add(Item item) {
        if (item.getWeight() > this.capacity) {
            this.capacity = this.capacity; 
        } else {
           
            items.add(item); 
            this.capacity-=item.getWeight(); 
           
        }
        
    }
    
    public boolean isInBox(Item item) {
       for (Item testItem: items) {
          if (testItem.getName().equals(item.getName())) {
              return true;
          }
       }
  return false;  }
    
    
    
}
