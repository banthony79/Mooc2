
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brycelooyenga
 */
public class ShoppingCart {
    
    private Map<String, Item> contents;
    
    public ShoppingCart() {
        
        this.contents = new HashMap<>(); 
    }
    //String product, int qty, int unitPrice)
    
    
    public void add(String product, int price) {  
     if (contents.containsKey(product)) {
     Item item = contents.get(product); 
     item.increaseQuantity();
     } else {
         Item item = new Item(product, 1, price);  
         contents.put(product, item);
     }
     
    }
    
    public int price() {
        int sum = 0; 
        for (Item item: contents.values()) {
            sum+=item.price(); 
        }
    return sum; }
    
    
    public void print() {
        for (Item item: contents.values()) {
            System.out.println(item.getName() + ": " + item.getQty());
        }
    }
    
    
    
}
