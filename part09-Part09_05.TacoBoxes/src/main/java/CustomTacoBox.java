/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brycelooyenga
 */
public class CustomTacoBox implements TacoBox {
    
    private int tacosRemaining; 
    
    public CustomTacoBox(int tacosRemaining) {
        this.tacosRemaining = tacosRemaining; 
    }
    
    public int tacosRemaining() {
        return this.tacosRemaining; 
    }
    
    public void eat()    {
            this.tacosRemaining--; 
        if (this.tacosRemaining - 1 < 0) {
            this.tacosRemaining = 0; 
        }
    }
    
    
}
