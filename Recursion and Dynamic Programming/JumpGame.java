public class JumpGame {
    public static void main(String[] args){

    }    
    public static boolean canJump(int[] nums) {
        if(nums.length == 0) return false;
        if(nums.length == 1) return true;
        boolean[] chart = new boolean[nums.length];
        chart[0] = true;
        
        
        for(int i = 0; i < nums.length; i++){
            if(chart[nums.length-1]) return true;
            if(chart[i]){
                for(int j = 0; j <= nums[i]; j++){
                    if(i + j < nums.length){
                        chart[i + j] = true;
                    }
                }
            }else{
                return false;
            }
        }
        return chart[nums.length-1];
        
    }
    
}
