import java.util.*;
public class IntersectionOfTwoArraysII {
    public static void main(String [] args){

    }

    public static int [] intersect(int [] nums1, int [] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int index1 = 0;
        int index2 = 0;
        List <Integer> list = new ArrayList<>();
        while(index1 < nums1.length && index2 < nums2.length){
            if(nums1[index1] == nums2[index2]){
                list.add(nums1[index1]);
                index1++;
                index2++;
            }else{
                if(nums1[index1] < nums2[index2]){
                    index1++;
                }else{
                    index2++;
                }
            }
        }
        int [] ans = new int[list.size()];
        int i= 0;
        for(int item: list){
            ans[i] = item;
            i++;
        }
        return ans;
    }
}
