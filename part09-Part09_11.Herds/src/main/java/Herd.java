
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brycelooyenga
 */
public class Herd implements Movable {
   
    private ArrayList <Movable> herdList; 
    
    
    public Herd() {
        this.herdList = new ArrayList<>(); 
    }
    
    public void addToHerd(Movable movable) {
        herdList.add(movable); 
    }
    
    public void move(int dx, int dy) {
        for (Movable creature: herdList) {
            Organism thing = (Organism) creature; 
            thing.move(dx, dy);
        }
    }
    
    public String toString() {
        String readout = ""; 
        for (Movable creature: herdList) {
            Organism thing = (Organism) creature; 
            readout+=thing.toString() + "\n";
        }
      return readout; }
}
