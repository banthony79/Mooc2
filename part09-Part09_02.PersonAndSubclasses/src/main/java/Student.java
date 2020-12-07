/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brycelooyenga
 */
public class Student extends Person {
 
    private int credits; 
 
    public Student(String name, String address) {
       super(name, address); 
        this.credits = 0;  
    }
 
    public void study() {
        this.credits++; 
    }
 
    @Override
    public String toString() {
        return getName() + "\n" + "  " + getAddress() + "\n" + "  " +
        "Study credits " + this.credits; 
    }
    
    public int credits() {
        return this.credits; 
    }
 
 
}
