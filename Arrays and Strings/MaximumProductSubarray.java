public class MaximumProductSubarray {
    public static void main(String[] args){
        
    }
    public static int maxProductSubArray(int [] nums){
        int currentMax = nums[0];
        int currentMin = nums[0];
    
        int totalMax = currentMax;
        
        for(int i = 1; i < nums.length; i++){
            int temp = currentMax * nums[i];
            currentMax = Integer.max(nums[i], Integer.max(currentMin*nums[i] , currentMax*nums[i]));
            currentMin = Integer.min(nums[i], Integer.min(currentMin*nums[i] , temp));
            
            totalMax = Integer.max(totalMax, currentMax);
        }
        return totalMax;
    }
}
