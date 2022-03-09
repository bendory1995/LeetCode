public class FirstBadVersion {

    public static void main(String [] args){

    }
    public static boolean isBadVersion(int n){
        int x = (int)Math.random()*2;
        if(x == 0) return false;
        else return true;
    }

    public static int firstBadVersion(int n){
        int lo = 1; 
        int hi = n;

        while(lo < hi){
            int mid = lo + (hi-lo)/2;
            if(!isBadVersion(mid)){
                lo = mid+1;
            }else{
                hi = mid;
            }
        }return lo;
    }
    
}
