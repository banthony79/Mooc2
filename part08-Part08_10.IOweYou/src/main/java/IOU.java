
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
public class IOU {
    
      
      private HashMap<String, Double> map; 
    
      public IOU() {
          
          this.map = new HashMap<>(); 
        
      }
      
      public void setSum(String toWhom, double amount) {
          map.put(toWhom, amount); 
      }
     
      public double howMuchDoIOweTo(String toWhom) {
         try {
          if (searchPerson(toWhom).equals(null)) {
              return 0; 
          } else {
          return map.get(toWhom); 
          }
          
           } catch(Exception e) {
        return 0; 
      }
         
     
}
      
      public String searchPerson(String searchedName) {
          for (String name: map.keySet()) {
              if (name.equals(searchedName)) {
                  return name; 
              }
          }
          
          return null; }
    
}
