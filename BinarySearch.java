// Given a sorted array of integers and a target value, 
// return the index of the target. 
// If not found, return -1. 
// nums = [1, 3, 5, 7, 9] 
// target = 7 // Output: 3 

public class Main{ 
    public static void main(String[] args){ 
        int[] nums = {1, 3, 5, 7, 9}; 
        int target = 7; 
        int left = 0; 
        int right = nums.length - 1; 
        
        while(left<=right){ 
            int middle = left + (right - left)/ 2; 
            
            if(target == nums[middle]){ 
                System.out.println(middle); 
                return; 
            } 
            else if(target < nums[middle]){
                right = middle-1; 
            } 
            else{ 
                left = middle+1; 
            } 
            
        } System.out.println(-1); 
        
    } 
    
}
