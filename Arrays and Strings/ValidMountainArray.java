public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        int len = arr.length;
        int i = 0;
        
        while(i + 1 < len && arr[i] < arr[i+1]){
            i++;
        }
        if(i == 0 || i == len-1) return false;
        
        while(i+1 < len && arr[i] > arr[i+1]){
            i++;
        }
        
        return i == len-1;
    }
}
