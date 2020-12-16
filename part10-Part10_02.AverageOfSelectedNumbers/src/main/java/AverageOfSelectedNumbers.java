
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        double positiveAverage = 0; 
        double negativeAverage = 0; 
        List <String> list = new ArrayList<>(); 
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            }
            
            list.add(input);
            
            if (Double.valueOf(input) > 0) {
                positiveAverage = positiveAverage(list);
            } else {
                negativeAverage = negativeAverage(list);
            }
            
             
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        
        String answer = scanner.nextLine(); 
        
        if (answer.equals("p")) {
            System.out.println("Average of the positive numbers: " + positiveAverage); 
        }
        
        if (answer.equals("n")) {
            System.out.println("Average of the negative numbers: " + negativeAverage); 
        }
        

    }
    
    
    public static double negativeAverage(List<String> list) {
     
           double neg = list.stream()
                    .mapToDouble(s -> Double.valueOf(s))
                    .filter(num -> num < 0)
                    .average()
                    .getAsDouble();
    
    return neg;   }
    
    
    public static double positiveAverage(List<String> list) {
      
          double  pos = list.stream()
                    .mapToDouble(s -> Double.valueOf(s))
                    .filter(num -> num > 0)
                    .average()
                    .getAsDouble();
    
    return pos;   }
    
    
}
