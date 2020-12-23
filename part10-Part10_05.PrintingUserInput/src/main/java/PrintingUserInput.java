
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        String words = "";
        ArrayList<String> strings = new ArrayList<>(); 
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String input = scanner.nextLine(); 
        
        if (input.isEmpty()) {
            break; 
        }
        
        strings.add(input);
       
        
        }
        
       strings.stream()
               .forEach(word -> System.out.println(word)); 
        
    }
}
