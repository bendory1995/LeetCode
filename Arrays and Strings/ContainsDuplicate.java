import java.util.*;
public class ContainsDuplicate {
    public static void main(String[] args){
        
    }

    //HashMap O(n) Solution
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(hs.contains(nums[i])) return true;
            hs.add(nums[i]);
            
        }
        return false;
    }
}
