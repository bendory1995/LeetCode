public class CombinationSum4 {
    public static void main(String[] args){

    }

    public static int combinationSum4(int [] nums, int target){
        // return combinationMemo(nums, target, new Integer[target+1]);
        return combinationBottomUp(nums, target, new int[target+1]);
        
    }

    //Top-Down Approach 
    public static int combinationMemo(int [] nums, int target, Integer[] memo){
        if (target == 0) return 1;
        if (target < 0) return 0;
        if (memo[target] != null){
            return memo[target];
        }

        int total = 0;

        for(int i = 0 ;i < nums.length; i++){
            total = total + combinationMemo(nums, target - nums[i], memo);
        }
        memo[target] = total;

        return memo[target];
    }
    //Bottom-Up Approach

    public static int combinationBottomUp(int [] nums, int target, int[] memo){
        memo[0] = 1;
        for(int i = 1; i < target+1; i++){
            int cur = i;
            for(int num: nums){
                if(cur - num >= 0){
                    memo[cur] += memo[cur - num];
                }
            }
        }
        return memo[target];
    }

}