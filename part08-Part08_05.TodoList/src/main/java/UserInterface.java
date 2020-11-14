
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brycelooyenga
 */
public class UserInterface {
    
    private TodoList list; 
    private Scanner scanner; 
    
    
    public UserInterface (TodoList list, Scanner scanner) {
        this.list = list; 
        this.scanner = scanner; 
    }
    
    public void start() {
    while(true) {
    
        System.out.println("Command:"); 
        String choice = scanner.nextLine(); 
        
        if (choice.equals("stop")) {
            break; 
        }
        
        if (choice.equals("add")) {
            add();    
        }
        
        if (choice.equals("list")) {
            list();
        }
        
        if (choice.equals("remove")) {
            remove(); 
       
    }
    
    }
  }
    
    public void add() {
        System.out.println("To add:");
        String task = scanner.nextLine(); 
        list.add(task); 
    }
    
    public void remove() {
       System.out.println("Which one is removed?"); 
       int removed = Integer.valueOf(scanner.nextLine());
       list.remove(removed); 
    }
    
    public void list() {
        list.print();
    }
    
}
