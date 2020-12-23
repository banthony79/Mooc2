
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>(); 
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            
            String input = scanner.nextLine(); 
            
            if (Integer.valueOf(input) < 0) {
                break; 
            }
            
            numbers.add(input);
            
            
        }
        
       numbers.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(num -> num <= 5 && num >= 1)
                .forEach(n -> System.out.println(n));

    }
}
