
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        List <String> list= new ArrayList<>(); 
        Scanner scanner = new Scanner(System.in);
        double average = 0; 
        
        while(true) {
            
            String input = scanner.nextLine(); 
            
            if (input.equals("end")) {
                break; 
            }
            
            list.add(input); 
            
            
                average = list.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .average()
                    .getAsDouble(); 
                
            
        }
        
        System.out.println("average of the numbers: " + average); 
        
        

    }
}
