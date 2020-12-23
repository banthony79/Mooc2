
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        

    }
    
    
    public static List<String> read(String file) {
         ArrayList<String> list = new ArrayList<>(); 
        try { Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNextLine()) {
            list.add(fileScanner.nextLine()); 
        }
        
         ArrayList<String> values = list.stream().map(s -> s)
        .collect(Collectors.toCollection(ArrayList::new));
         
        } catch (Exception e) {
            System.out.println("file not found");
        }
        
  
   return new ArrayList<>(); 
    }

}
