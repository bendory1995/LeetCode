import java.util.*;
public class MergeIntervals{
    public static void main(String[] args){

    }
    public static int [][] merge(int[][] intervals){
        if(intervals.length <= 1) return intervals;
        
        Arrays.sort(intervals, (arr1, arr2)-> Integer.compare(arr1[0], arr2[0]));

        List<int[]> list = new ArrayList();
        int [] currentArr = intervals[0];
        list.add(currentArr);

        for(int [] interval: intervals){
            int currBegin = currentArr[0];
            int currEnd = currentArr[1];
            int nextBegin = interval[0];
            int nextEnd = interval[1];

            if(currEnd >= nextBegin){
                currentArr[1] = Math.max(currEnd, nextEnd);
            }else{
                currentArr = interval;
                list.add(currentArr);
            }
        }
        return list.toArray(new int[list.size()][2]);

    }
}