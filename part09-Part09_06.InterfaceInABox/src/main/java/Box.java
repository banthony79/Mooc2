
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brycelooyenga
 */
public class Box implements Packable {
    
    private double capacity; 
    private ArrayList<Packable> list; 
   
   
    
    
    public Box(double capacity) {
      
        this.capacity = capacity; 
       
        this.list = new ArrayList<>();
        
    }
    
    public double originalWeight(){
        final double originalWeight = this.capacity; 
        return originalWeight; 
    }
    
     public double weight() {
         double sum = 0; 
         for (Packable item: list) {
            sum+=item.weight(); 
         }
     
    return sum; }
    
<<<<<<< HEAD
     public void add(Packable item) {
        double remainingWeight = (this.capacity - weight()); 
       if (item.weight() < remainingWeight) { 
           list.add(item); 
          
       }

=======
    public void add(Item item) {
        double remainingWeight = (this.capacity - weight()); 
       if (item.weight() < remainingWeight) {
           System.out.println("Remaining weight: " + remainingWeight); 
           list.add(item); 
           //System.out.println(weight()); 
           System.out.println(item.getTitle() + "added"); 
       }
          
>>>>>>> 5a2b5e6de00119914b4946ce9c4873286438102e
    }
    
    
    
    @Override 
    public String toString() {
        return "Box: " + list.size() + " items, total weight " +  String.format("%.1f", weight())  + " kg"; 
    }
    
}
    
}
