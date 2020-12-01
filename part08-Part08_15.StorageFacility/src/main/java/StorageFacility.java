
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brycelooyenga
 */
public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> storage; 
    
    public StorageFacility() {
        
        this.storage = new HashMap<>(); 
    }
    
    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<String>());
        this.storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        
        if (this.storage.containsKey(storageUnit)) {
            ArrayList things = this.storage.get(storageUnit); 
            return things; 
        } else {
            return (new ArrayList<String>()); 
        }
        
    }
    
    
    public void remove(String storageUnit, String item) {
        this.storage.get(storageUnit).remove(item); 
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> storageUnits = new ArrayList<>(); 
        for (String unit: storage.keySet()) {
            if (this.storage.get(unit).size() > 0) {
            storageUnits.add(unit); 
            }
    }
        
        
    return storageUnits; 
    }
    
    
    
    
}
