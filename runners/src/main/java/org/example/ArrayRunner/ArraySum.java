package org.example.ArrayRunner;

import java.util.Arrays;

public class ArraySum {

    public static void main(String [] args){

        int [] nums = {1,2,3,4,5};
        System.out.println("Sum Array- "+Arrays.stream(nums).sum());

    }

}
