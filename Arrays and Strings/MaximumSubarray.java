public class MaximumSubarray {
    public static void main(String[] args){

    }
    public int maxSubArray(int[] nums) {
        if(nums.length == 1) return nums[0];
        int currentMax = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int sum  = nums[i];
            currentMax = Math.max(currentMax, sum);
            for(int j = i+1; j < nums.length; j++){
                sum = sum + nums[j];
                currentMax = Math.max(sum, currentMax);
            }
        }
        return currentMax;
    }
    public int maxSubArray2(int [] nums){
        int currentMax = nums[0];
        int totalMax = nums[0];

        for(int i = 1; i < nums.length; i++){
            currentMax = Math.max(currentMax + nums[i], nums[i]);
            totalMax = Math.max(totalMax, currentMax);
        }
        return totalMax;
    }
}
