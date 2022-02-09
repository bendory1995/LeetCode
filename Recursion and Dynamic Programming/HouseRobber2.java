import java.util.*;

public class HouseRobber2 {
    public static void main(String[] args){

    }
    public static int rob(int[] nums){
        if(nums.length ==0 )return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);

        return Math.max(houseRob(nums, 0, nums.length-1), nums, 1, nums.length);
    }
    public static int houseRob(int [] nums, int start, int end){
        int [] memo = new int [nums.length];
        
        //regular case
        if(start == 0){
            memo[0] = nums[0];
            memo[1] = Math.max(nums[0], nums[1]);
        }else{
            memo[0] = 0;
            memo[1] = nums[1];
        }

        for(int i = 2; i< end; i ++){
            memo[i] = Math.max(memo[i-1], nums[i] + memo[i-2]);
        }
        return memo[end-1];
    }
}
