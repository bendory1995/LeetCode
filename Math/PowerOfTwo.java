public class PowerOfTwo{
    public static void main(String[] args){

    }

    public static boolean isPowerOfTwo(int n){
        if (n < 0) return false;
        if(n == 0) return false;
        if(n == 1) return true;
        
        while(n %2 == 0 && n > 0){
            n = n/2;
        }
        if(n > 1) return false;
        return true;
    }
}