import java.util.*;
public class SlidingWindowMaximum {
    public static void main(String [] args){

    }

    public static int [] maxSlidingWindow(int [] nums, int k){
        int [] result = new int[nums.length-k+1];
        
        Queue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>(){
            @Override
            public int compare(Integer l1, Integer l2){
                return Integer.compare(l2, l1);
            }
        });

        for(int i = 0; i < k; i ++){
            queue.add(nums[i]);
        }
        for(int i = k; i < nums.length; i++){
            queue.remove(nums[i-k]);
            queue.add(nums[i]);
            result[i - k + 1] = queue.peek();
        }
        return result;
    }
}
