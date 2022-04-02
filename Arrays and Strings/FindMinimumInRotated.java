public class FindMinimumInRotated {
    public static void main(String[] args){
        
    }

    public static int findMin(int [] nums){
        return findLowest(0, nums.length-1, nums);    
    }
    public static int findLowest(int lo, int hi, int [] nums){
        if(lo >= hi) return nums[lo];
        int mid = lo + (hi-lo)/2;
        if(nums[mid] > nums[hi]){
            return findLowest(mid + 1, hi ,nums);
        }else{
            return findLowest(lo, mid, nums);
        }
    }
}
