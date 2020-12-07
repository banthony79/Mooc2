/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brycelooyenga
 */
public class CD extends Item {
    
    private int publicationYear; 
    
    public CD(String title, String artist, int publicationYear) {
        super(title, artist, .1);    
        
        this.publicationYear = publicationYear; 
    }

    
    public double weight() {
        return super.weight(); 
    }
    //Pink Floyd: Dark Side of the Moon (1973)
    
    @Override 
    public String toString() {
        return this.getArtist() + ": " + this.getTitle() + " (" + this.publicationYear + ")"; 
    }
    
}
