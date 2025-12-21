// Given an integer array nums and an integer k,
// find the maximum sum of any contiguous subarray of size k.
// nums = [2, 1, 5, 1, 3, 2]
// k = 3
// Output: 9
// Explanation: Subarray [5,1,3] has maximum sum = 9

import java.util.*;
class Main {
    public static void main(String[] args) {
       int[] nums = {2, 1, 5, 1, 3, 2, 9};
       int k=3;
       
       int max = 0;
       for(int i=0;i<k;i++){
           max+=nums[i];
       }
       
       int l= k;
       int r = nums.length;
       int sum = max;
       while(l<r){
           sum = sum + nums[l] - nums[l-k];
           max = Math.max(max,sum);
           l++;
       }
       
       System.out.println(max);
    }
}
