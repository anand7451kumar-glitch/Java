import java.util.*;

public class string3 {
    public static void main(String[] args) {
       //concatenation
       String name1 = "TONY";
       String name2 = "TONY";

       //1 s1 > s2 = positive value
       //2 s1 == s2 = 0
       //3 s1 < s2 = negative value

       //hello<wello
       

       if(name1.compareTo(name2) == 0) {
        System.out.println("Strings are equal");
       } else {
        System.out.println("Strings are not equal");
       }

    //    if(name1 == name2) {
    //     System.out.println("Strings are equal");
    //    } else {
    //     System.out.println("Strings are not equal");
    //    }

       if(new String("TONY") == new String("TONY")) {
        System.out.println("Strings are equal");
       } else {
        System.out.println("Strings are not equal");
       }
    
     
       

       

        
    }
    
}
