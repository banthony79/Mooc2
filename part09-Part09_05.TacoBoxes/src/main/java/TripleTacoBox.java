/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brycelooyenga
 */
public class TripleTacoBox implements TacoBox {
    
    private int tacosRemaining;  
    
    
    public TripleTacoBox() {
      
        this.tacosRemaining = 3; 
    }
    
    public void eat() {
        this.tacosRemaining--; 
        if (this.tacosRemaining - 1 < 0) {
            this.tacosRemaining = 0; 
        }
    }
    
   

    
    public int tacosRemaining() {
        return this.tacosRemaining; 
    }

}
