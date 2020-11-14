
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container = new Container();
        Container secondContainer = new Container(); 


        while (true) {
            
            System.out.println("First: " + container);
            System.out.println("Second: " + secondContainer); 
            
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            
            
            String [] inputs = input.split(" "); 
            String command = inputs[0];
            int number = Integer.valueOf(inputs[1]);
            
            if (command.equals("add")) {
                add(number, container); 
            }
            
            if (command.equals("move")) {
                move(number, container, secondContainer); 
            }
            
            if (command.equals("remove")) {
                remove(number, secondContainer); 
            }

        }
        
    }
    
    public static void add(int amount, Container container) {
        if (container.contains() + amount > 100) {
            container.add(100); 
        } else {
            container.add(amount); 
        }
        
    }
    
    public static void move(int amount, Container firstContainer, Container secondContainer) {
              if (firstContainer.contains() > amount) {
              firstContainer.remove(amount);
              secondContainer.add(amount); 
          } else {
                  int firstContainerOG = firstContainer.contains(); 
                  firstContainer.remove(firstContainer.contains());
                  secondContainer.add(firstContainerOG); 
              }
        }
    
    
    public static void remove(int amount, Container secondContainer) {
            secondContainer.remove(amount);        
    }
    
    
    
    

}
