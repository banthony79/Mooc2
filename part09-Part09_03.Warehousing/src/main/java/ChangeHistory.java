
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brycelooyenga
 */
public class ChangeHistory {
    
    private ArrayList<Double> list; 
    
    
    public ChangeHistory() {
        
        this.list = new ArrayList<>(); 
    }
    
    
   public void add(double status) {
       list.add(status);
   }
   
   public void clear() {
       list.clear();
   }
   
   
   public double maxValue() {
       if (list.isEmpty()) {
           return 0; 
       }
       
       double maxValue = Collections.max(list);
       return maxValue; 
   }
   
   
   
    public double minValue() {
        if (list.isEmpty()) {
            return 0; 
        }
        double min = Collections.min(list);
        
    return min; }
    
    
    
    public String toString() {
        return this.list.toString(); 
    }
   
    
    
    public double average() {
        if (list.isEmpty()) {
            return 0; 
        }
        double sum = 0;
        for (Double num: list) {
        sum+=num; 
     
        }
  return sum/list.size();  }
    
    public ArrayList<Double> getList() {
        return this.list; 
    }
    
    
}
