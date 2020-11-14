
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0; 
        int secondContainer = 0; 
        while (true) {
            
            System.out.println("First: "+ firstContainer + "/100");
            System.out.println("Second: "+ secondContainer + "/100");
            
            System.out.print("> ");
            
            

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String [] inputs = input.split(" "); 
            String command = inputs[0];
            int number = Integer.valueOf(inputs[1]);
            
            if (command.equals("add")) {
                
                if (number > 0)  {
                int addedAmount = firstContainer+=number; 
                if (addedAmount > 100) {
                    firstContainer = 100; 
                } else {
                    firstContainer = addedAmount; 
                }
                
                }
                
            }
            
             //moves the amount of liquid specified by the parameter from the first container to the second container. 
            //The given amount must be specified as an integer. 
            //If the program is requested to move more liquid than than the first container currently holds, 
            //move all the remaining liquid. The second container can't hold more than one hundred liters of 
            //liquid and everything past that will go to waste.
            
            
            if (command.equals("move")) {
                if (number > 0) {
                    if (number > firstContainer) {
                        int OGSecond = secondContainer; 
                        secondContainer = firstContainer + OGSecond; 
                        if (firstContainer - number < 0) {
                            firstContainer = 0; 
                        } else {
                            firstContainer = firstContainer - number; 
                        }
                    } else if (secondContainer + firstContainer > 100) {
                        secondContainer = 100; 
                        firstContainer= firstContainer - number; 
                   
                    } else {
                        firstContainer = firstContainer - number;
                        secondContainer = secondContainer + number; 
                    }
                    
                }
                
            }
            
           //remove amount removes the amount of liquid specified by the parameter from the 
           //second container. If the program is requested to remove more liquid than the 
           //container currently holds, remove all the remaining liquid.
            
            if (command.equals("remove")) {
                if (number >= secondContainer) {
                    secondContainer = 0; 
                } else {
                    secondContainer = secondContainer - number; 
                }
            }
        }
    }
}


