/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brycelooyenga
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    
    
    private ChangeHistory history; 
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        
       
        this.history = new ChangeHistory();
        this.addToWarehouse(initialBalance);
        
            
    }
    
    
    public String history() {
        return history.getList().toString(); 
    }
    
   
   public void printAnalysis() {
       System.out.println("Product: " + this.getName());
       System.out.println("History: " + history()); 
       System.out.println("Largest amount of product: " + history.maxValue());
       System.out.println("Smallest amount of product: " + history.minValue());
       System.out.println("Average: " + String.format("%.1f", history.average()));
   }
      

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
         history.getList().add(this.getBalance());
    }
    
    
   

    @Override
    public double takeFromWarehouse(double amount) {
        double inventory = super.takeFromWarehouse(amount);
        history.getList().add(this.getBalance());
        return inventory; 
    }
    
    
    

       
  }
   
 
    
    
    