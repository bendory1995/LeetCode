public class BinarySearch {
    public static void main(String[] args){
        int [] nums = new int[]{1,2,3,4,5,6,7,10, 20,40,55,56,89,200,300,301,303,500};

        System.out.println(search(nums, 55));
        System.out.println(search(nums, 500));
        System.out.println(search(nums,1));
    }

    public static int search(int [] nums, int target){
        return binarySearch(nums, target, 0, nums.length-1);
    }
    public static int binarySearch(int [] nums, int target, int low, int high){
        if(low > high) return -1;

        int mid = (high-low)/2 + low;
        if(nums[mid] == target){
            return mid;
        }
        else if (nums[mid] < target){
            return binarySearch(nums, target, mid+1, high);
        }
        else{
            return binarySearch(nums, target, low, mid-1);
        }
    }
}
