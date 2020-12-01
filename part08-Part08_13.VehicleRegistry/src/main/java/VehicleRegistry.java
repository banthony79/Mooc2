
import java.util.HashMap;
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brycelooyenga
 */
public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> hmap; 
    
    public VehicleRegistry() {
    
    this.hmap = new HashMap<>(); 
    }
    
    public boolean add(LicensePlate licensePlate, String owner)  {
        if (!this.hmap.containsKey(licensePlate)) {
            this.hmap.put(licensePlate, owner);
            return true; 
        }
   return false; }
    
    
    public String get(LicensePlate licensePlate)  {
       return this.hmap.get(licensePlate); 
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (!hmap.containsKey(licensePlate)) {
            return false; 
        }
        this.hmap.remove(licensePlate);
        return true; 
    }
    
    public void printLicensePlates() {
        for (LicensePlate plate: hmap.keySet()) {
            System.out.println(plate.toString());
        }
    }
    
    public void printOwners() {
        HashSet<String> set = new HashSet();
     
        for (String owner: hmap.values()) {
            set.add(owner);
        }
        
        for (String owner:set) {
            System.out.println(owner); 
        }
    }
}
