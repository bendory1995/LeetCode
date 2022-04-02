public class MaximumProductSubarray {
    public static void main(String[] args){
        
    }
    public static int maxProductSubArray(int [] nums){
        int currentMin = nums[0];
        int currentMax = nums[0];
        int totalMax = nums[0];
        for(int i = 1; i < nums.length; i++){
            int temp = currentMax;
            currentMax = Integer.max(nums[i] , Integer.max(nums[i]* currentMin, nums[i] * currentMax));
            currentMin = Integer.min(nums[i] , Integer.min(nums[i]* currentMin, nums[i] * temp));
            totalMax = Math.max(currentMax, totalMax);
        }
        return totalMax;
    }
}
