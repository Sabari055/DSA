// Anagram Check (Strings / Sorting or Counting)
// s = "listen"
// t = "silent"
// Output: true

import java.util.*;
public class Main{
    public static void main(String[]args){
        String s = "listen";
        String t = "silent";
    
        if(s.length()!=t.length()){
            System.out.println(false);
            return;
        }
        
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        System.out.println(Arrays.equals(ch1,ch2));
    }
}

