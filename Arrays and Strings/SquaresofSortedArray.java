public class SquaresofSortedArray {
    public static void main(String[] args){

    }
    public static int [] sortedSquares(int [] nums){
        int [] ans = new int [nums.length];
        int index2 = 0;
        int ansIndex = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[index2] < 0){
                index2++;
            }
        }

        int index1 = index2-1;

        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        while(index1 >= 0 && index2 < nums.length){
            if(nums[index1] < nums[index2]){
                ans[ansIndex] = nums[index1];
                index1--;
            }else{
                ans[ansIndex] = nums[index2];
                index2++;
            }
            ansIndex++;
        }

        while(index1 >= 0){
            ans[ansIndex] = nums[index1];
            index1--;
            ansIndex++;
        }
        while(index2 < nums.length){
            ans[ansIndex] = nums[index2];
            index2++;
            ansIndex++;
        }
        return ans;

    }
}

