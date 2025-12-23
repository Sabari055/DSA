// List<Integer> nums = Arrays.asList(3, 5, 7, 2, 8);

// Using Java Streams, find the sum of all even numbers.

import java.util.*;
public class Main{
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(3, 5, 7, 2, 8);
        
        System.out.println(nums.stream()
        .filter(i -> i%2==0)
        .reduce(0, (i,j)->i+j));
    }
}
