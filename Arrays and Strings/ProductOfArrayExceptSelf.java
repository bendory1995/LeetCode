public class ProductOfArrayExceptSelf {
    public static void main(String[] args){
        
    }
    public int[] productExceptSelf(int[] nums) {
        int [] ans = new int [nums.length];

        ans[0] = 1;

        for(int i = 1; i < ans.length; i++){
            ans[i] = ans[i-1]* nums[i-1];
        }
        int mult = 1;
        for(int i = nums.length-1; i>= 0; i--){
            ans[i] = ans[i]* mult;
            mult = mult* nums[i];
        }
        return ans;
    }
}
