import java.util.*;

public class string2 {
    public static void main(String[] args) {
       //concatenation
       String firstName = "TONY";
       String lastName = "STARK";
       String fullName = firstName + " " + "MC" + " " + lastName;
       System.out.println(fullName);
       //System.out.println(fullName.length());

       for(int i=0; i<fullName.length(); i++) {
        System.out.println(fullName.charAt(i));
       }

        
    }
    
}
