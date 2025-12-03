package org.example.ArrayRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindDuplicate {

    public static void main(String[]args){
        int [] nums={1,2,3,3,4,5,5};
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
                list.add(nums[i]);
        }
        System.out.println("Duplicate- "+list);

        int[] res = IntStream.range(0,nums.length).map(i->nums[nums.length-1-i])
                .toArray();
        System.out.println("Reverse- "+Arrays.toString(res));
    }



}
