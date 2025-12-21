// Using Java Streams, find the duplicate elements.

import java.util.*;
public class Main{ 
    public static void main(String[] args){ 
        List<Integer> nums = Arrays.asList(3, 6, 9, 2, 6, 3, 8);
        
        Set<Integer> set = new HashSet<>();
        
        System.out.println(nums.stream()
        .filter(i -> !set.add(i))
        .toList());
    } 
    
}
