import java.util.*;
public class ThreeSum {
    public static void main(String[] args){

    }
    public static List<List<Integer>> threesum(int [] nums){
        Set<List<Integer>> hashset = new HashSet<>();
        Set<Integer> dups = new HashSet<>();
        Map<Integer, Integer> hashmap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(dups.add(nums[i])){
                for(int j = i+1; j < nums.length; j++){
                    int complement = 0 - nums[i] - nums[j];

                    if(hashmap.containsKey(complement) && hashmap.get(complement) == i){
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                        Collections.sort(triplet);
                        hashset.add(triplet);
                    }
                    hashmap.put(nums[j], i);
                }
            }
        }
        return new ArrayList(hashset);
    }
    
}
