
public class Main {

    public static void main(String[] args) {
        
        SimpleDate date = new SimpleDate(1, 1, 1999);
        SimpleDate date2 = new SimpleDate(1, 1, 1999);
        
        System.out.println(date.hashCode());
        System.out.println(date2.hashCode()); 
        
        
    }
}
