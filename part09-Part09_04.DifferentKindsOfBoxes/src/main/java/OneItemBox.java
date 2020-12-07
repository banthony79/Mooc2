
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
public class OneItemBox extends Box {
    
    private ArrayList <Item> list;  
    
     public OneItemBox() {
         this.list = new ArrayList<>(); 
     }
     
      public void add(Item item) {
         if (this.list.size() == 0) {
             this.list.add(item);
         } 
      }
         
         public boolean isInBox(Item item) {
             for (Item testItem: list) {
          if (testItem.getName().equals(item.getName())) {
              return true;
          }
             }
        return false;  }
             
      
      
      
          
    
    
    
}
