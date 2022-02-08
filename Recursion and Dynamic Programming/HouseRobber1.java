public class HouseRobber1 {
    public static void main(String[] args){

    } 
    public static int rob(int [] nums){
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);

        int [] memo = new int[nums.length];
        memo[0] = nums[0];
        memo[1] = Math.max(nums[0], nums[1]);

        for(int i = 2; i < nums.length; i++){
            memo[i] = Math.max(memo[i-1], nums[i] + memo[i-2]);
        }
        return memo[nums.length-1];
    }
}
