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
    
}
