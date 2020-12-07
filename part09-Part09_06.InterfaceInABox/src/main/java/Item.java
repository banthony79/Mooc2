/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brycelooyenga
 */
public class Item implements Packable {
    
    private String artist; 
    private String title;
    private double weight; 
     
    
    
    public Item(String title, String artist, double weight) {
        this.title = title;
        this.artist = artist; 
        this.weight = weight; 
        
    }
    
    public double weight() {
        return this.weight; 
    }
    
    public String getArtist(){
        return this.artist; 
    }
    
    public String getTitle() {
        return this.title; 
    }
    
}
