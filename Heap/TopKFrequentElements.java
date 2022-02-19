import java.util.*;
public class TopKFrequentElements {
    public static void main(String[] args){

    }
    public static int [] topKFrequent(int [] nums , int k){
        Map<Integer, Integer> hashmap = new HashMap<>();

        //put everything in hashmap 
        for(int i = 0 ; i < nums.length; i++){
            hashmap.put(nums[i], hashmap.getOrDefault(nums[i], 0)+1);
        }

        //create a priority queue and sort it 

        PriorityQueue<Integer> pq = new PriorityQueue<>((n1,n2)->hashmap.get(n1)-hashmap.get(n2));
        
        // just adding the numbers to pq from least frequent to most frequent
        for(int i : hashmap.keySet()){
            pq.add(i);
            if(pq.size()> k) pq.poll();
        }
    }
}
