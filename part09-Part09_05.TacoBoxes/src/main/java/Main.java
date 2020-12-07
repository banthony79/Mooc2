
public class Main {

    public static void main(String[] args) {
        TripleTacoBox t = new TripleTacoBox(); 
        
       for (int i = 0; i < 4; i++) {
           t.eat();
           System.out.println(t.tacosRemaining()); 
       }
        
        
    }
}
