//Strings are immutable

import java.util.*;

public class builder {
    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("Tony");
       System.out.println(sb);

       //char at index 0
       System.out.println(sb.charAt(0));

       // set cahr at index 0
       sb.setCharAt(0, 'P');
       System.out.println(sb);

       sb.insert(0, 'S');
       System.out.println(sb);

       sb.insert(2, 'n');
       System.out.println(sb);

       //delete the extra n
       sb.delete(2, 3);
       System.out.println(sb);

       




        
    }
    
}




// Stack String
//String str = "h";
// str + "e" = he
//str + "ll" = hell
 
