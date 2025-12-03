package org.example.ArrayRunner;

import java.util.Arrays;

public class MissingNum {
    public static void main(String[]args){
        int []nums = {7,6,4,3};
        Arrays.sort(nums);
        int j= nums[0];

        for(int num : nums){
            if(j!=num){
                System.out.println("Missing Num- "+ Arrays.toString(new int[]{j, num}));
                break;}
            j++;
        }


    }
}
