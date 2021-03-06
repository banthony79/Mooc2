
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brycelooyenga
 */
public class Warehouse {
    
    private Map<String, Integer> products;
    private Map<String, Integer> inventory;
    
    
    public Warehouse() {
        this.products = new HashMap<>(); 
        this.inventory = new HashMap<>(); 
        
    }
    
    public void addProduct(String product, int price, int stock) {
       inventory.put(product, stock); 
        for (int i = 0; i < stock; i++) { 
            products.put(product, price); 
                        
        }
    }

    public Map<String, Integer> getProducts() {
        return products;
    }

    public Map<String, Integer> getInventory() {
        return inventory;
    }
    
    
    
    public int price(String product) {
      if (!products.containsKey(product)) {
          return -99; }
      return products.get(product); 
    } 
    
    public Set<String> products() {
       Set <String> productList = new HashSet<>(); 
       for (String product: inventory.keySet()) {
        productList.add(product); 
    }       
   return productList;  }
    
    
    public int stock(String product) {
        if (!products.containsKey(product)) {
            return 0; 
        }
     return inventory.get(product);
    }
    
    public boolean take(String product) {
        if (inventory.containsKey(product)) {
        int value = inventory.get(product);
        if (value > 0) {
            value = value - 1; 
            inventory.put(product, value); 
            return true; 
        }
        if (value <= 0) {
            value = 0; 
            inventory.put(product, value); 
            return false; 
        }
     }
   return false; }
    
    
    
    
}
