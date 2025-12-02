package org.example.ArrayRunner;

import java.util.Arrays;

public class MaxVal{
    public static void main(String[]args){
        int[] nums ={5,4,3,5,6,7};

        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        System.out.println("Max in Array- "+max);

        System.out.println("Min in Array- "+ Arrays.stream(nums).min().orElse(Integer.MIN_VALUE));
    }
}