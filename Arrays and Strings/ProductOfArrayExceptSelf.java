public class ProductOfArrayExceptSelf {
    public static void main(String[] args){
        
    }
    public int[] productExceptSelf(int[] nums) {
        //answer array
        int [] ans = new int[nums.length];
        
        //Left Array and Right Array
        int [] left = new int [nums.length];
        int [] right = new int [nums.length];
        
        //Initialize the Array to 1 on ends
        left[0] = 1;
        right[right.length-1] = 1;
        
        //Left Array Calculation O(n)
        for(int i = 1; i < left.length; i++){
            left[i] = nums[i-1] * left[i-1]; 
        }
        //Right Array Calculation O(n)
        for(int j = nums.length-2; j >= 0; j--){
            right[j] = nums[j+1] * right[j+1];

        }
        
        //Calculating Answer Array
        for(int i = 0; i < nums.length; i++){
            ans[i] = left[i] * right[i];
        }
        
        return ans;
    }
}
