import java.util.*;
public class MissingNumber {
    public static void main(String[] args){

    }
    public static int missingNumber(int[] nums){
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            hs.add(nums[i]);
        }

        for(int i = 0; i <= nums.length; i++){
            if(!hs.contains(i)){
                return i;
            }
        }
        return -1;
    }

    public static int missingNumber2(int [] nums){
        int sum = (nums.length * (nums.length+1))/2;

        for(int i = 0; i < nums.length; i++){
            sum = sum - nums[i];
        }
        return sum;
    }
    
}
