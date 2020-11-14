
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double count = 0; 
        double sum = 0; 
        double number = 0; 
        while (true) {
            
            number = Double.valueOf(scanner.nextLine()); 
            if (number == 0) {
                break; 
            }
            if (number > 0) {
                count++; 
                sum+=number; 
            }
            
        }
        
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = sum/count; 
            System.out.println(average);
        }
    }
}
