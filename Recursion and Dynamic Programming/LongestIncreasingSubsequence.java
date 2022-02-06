import java.util.*;
public class LongestIncreasingSubsequence {
    public static void main(String[] args){
        
    }
    public static int lengthOfLIS(int [] nums){
        int [] memo =  new int [nums.length];
        Arrays.fill(memo, 1);

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    memo[i] = Math.max(memo[i], memo[j] +1);
                }
            }
        }
        
        int max = 1;
        for(int i = 0; i < nums.length; i++){
            if(max < memo[i]) max = memo[i];
        }
        return max;
    }
}
