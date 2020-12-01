
import java.util.HashMap;
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null  || this.getClass() != obj.getClass()) {
            return false; 
        }
        
        if (obj == this) {
            return true; 
        }
        
        if (!(obj instanceof LicensePlate)) {
            return false; 
        }   
        
        LicensePlate plate = (LicensePlate) obj; 
        
        if ((plate.country.equals(this.country)) && ((plate.hashCode() == this.hashCode()))) {
            return true; 
        }
        
   return false;  }

        @Override
        public int hashCode() {
        return charactersToNumber(); 
    } 
        
        
        public int charactersToNumber() { 
            char characters [] = "-abcdefghijklmnopqrstuvwxyz1234567890 ".toCharArray();
             int x = 0; 
             String lowercase = this.liNumber.toLowerCase(); 
             for (int i = 0; i < this.liNumber.length(); i++) {
                 x+=returnPosition((lowercase.charAt(i)), characters); 
             }
            
        return x; }
        
        
        public int returnPosition(char letter, char [] array) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == letter) {
                    return i * 12; 
                }
             }
        
      return -1;  }


/*    
assigns the owner it received as a parameter to a car that 
corresponds to the license plate received as a parameter. 
If the license plate doesn't have an owner, the method returns true. 
If the license already has an owner attached, the method returns false and does nothing. */

  
}
    
    

    
    





