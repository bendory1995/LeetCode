public class NumberOf1Bits{
    public static void main(String[] args){
        
    }

    public static int hammingWeight(int n){
        int count = 0;
        while(n != 0){
            count++;
            n = n & (n-1);
        }
        return count;
    }
}