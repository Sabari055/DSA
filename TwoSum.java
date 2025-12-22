// Two Sum
// nums = [2, 7, 11, 15]
// target = 9
// Output: true   (2 + 7 = 9)

public class Main{
    public static void main(String[]args){
        int[] nums = {1, 2, 6, 7, 11, 15};
        int target = 9;
        
        
        
        int left = 0;
        int right = nums.length-1;
        
        while(left<right){
            int sum = nums[left]+nums[right];
            if(sum==target){
                System.out.println(left+" and "+right);
                return; 
            }
            else if(sum>target){
                right--;
            }else{
                left++;
            }
        }
        System.out.println("No matches");
        
        
    }
}
