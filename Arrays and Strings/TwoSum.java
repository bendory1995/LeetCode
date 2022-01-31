import java.util.*;
public class TwoSum {
    public static void main(String [] args){


    }
    //O(n^2) Solution
    public static int[] twoSum2ForLoop(int[] nums, int target) {
        int [] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }
    //O(n) Solution
    public static int [] twoSumHashMap(int [] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        int [] ans = new int [2];
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            
            if(map.containsKey(complement)){
                ans[0] = i;
                ans[1] = map.get(complement);
            }else{
                map.put(nums[i], i);
            }
            
        }
        return ans;
    }
}
