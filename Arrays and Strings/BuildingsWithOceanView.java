import java.util.*;
public class BuildingWithOceanView{
    public static void main(String[] args){
        
    }
    //my original solution
    public static int [] findBuildings(int[] heights){
        List<Integer> list = new ArrayList();
        int currentMax = heights[heights.length-1];
        //rightmost always gets the view
        list.add(heights.length-1);

        for(int i = heights.length-2; i >= 0; i--){
            if(heights[i] > currentMax && heights[i] >= heights[i+1]){
                list.add(i);
            }
            currentMax = Integer.max(currentMax, heights[i]);
        }

        int [] ans = new int [list.size()];
        int j = list.size()-1;
        for(int i = 0; i < list.size(); i++){
            ans[j] = list.get(i);
            j--;
        }
        return ans;
    }
}