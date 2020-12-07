/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brycelooyenga
 */
public class Book extends Item {
    
   public Book(String artist, String title, double weight) {
       super(artist, title, weight);
         
}
    
    public double weight() {
        return super.weight(); 
    }
    
    
    @Override
    public String toString() {
        return this.getArtist() + ": " + this.getTitle() + this.weight(); 
    }
}



