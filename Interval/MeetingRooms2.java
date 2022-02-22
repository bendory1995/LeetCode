import java.util.*;

public class MeetingRooms2 {
    public static void main(String[] args){

    }
    public static int minMeetingRooms(int[][] intervals){
        int [] startTime = new int[intervals.length];
        int [] endTime = new int[intervals.length];

        for(int i = 0; i < intervals.length; i++){
            startTime[i] = intervals[i][0];
            endTime[i] = intervals[i][1];
        }
        Arrays.sort(startTime);
        Arrays.sort(endTime);

        int numRooms = 0;
        int endIndex = 0;

        for(int i = 0 ; i < intervals.length; i++){
            if(startTime[i] < endTime[endIndex]){
                numRooms++;
            }else{
                endIndex++;
            }
        }
        return numRooms;
    }

}
