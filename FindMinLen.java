// (Sliding Window | Variable Size | Medium)

// Given a positive integer array nums and an integer target,
// find the minimum length of a contiguous subarray whose sum is ≥ target.
// If no such subarray exists, return 0.
// nums = [2,3,1,2,4,3]
// target = 7
// Output: 2
// Explanation: [4,3] has minimum length 2
import java.util.*;
public class Main{
    public static void main(String[]args){
        int[] nums={2,3,1,2,4,3, 1};
        int target = 7;
        
        int res = Integer.MAX_VALUE;
        int l = 0;
        int r = 0;
        int sum = 0;
        int c = 0;
        while(r<nums.length){
                sum+=nums[r];
               
                while(sum>=target){
                    res = Math.min(res,r-l+1);
                    sum = sum - nums[l];
                    l++;
                }
                r++;
        }
        System.out.print(res==Integer.MAX_VALUE?0:res);
    }
}
