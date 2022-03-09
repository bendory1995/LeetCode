public class SearchInsertPosition {
    
    public static void main(String[] args){

    }

    public static int search(int[] nums, int target){
        return binarySearch(nums, 0, nums.length-1, target);
    }
    public static int binarySearch(int [] nums, int lo, int hi, int target){
        int mid = lo + (hi-lo)/2;

        if(lo > hi) return lo;

        if(nums[mid] == target) return mid;
        else if (nums[mid] > target){
            return binarySearch(nums, lo, mid-1, target);
        }else{
            return binarySearch(nums, mid+1, hi, target);
        }
    }
}
