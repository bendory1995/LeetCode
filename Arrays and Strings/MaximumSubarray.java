public class MaximumSubarray {
    public static void main(String[] args){

    }
    public int maxSubArray(int[] nums) {
        int min = nums[0];
        int totalMax = nums[0];
        int localMax = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            if(localMax < 0) localMax = 0;
            localMax = localMax + nums[i];
            if(localMax > totalMax) totalMax = localMax;
        }
        
        return totalMax;
    }
}
