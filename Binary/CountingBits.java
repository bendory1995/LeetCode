public class CountingBits {
    public static void main(String[] args){

    }
    public static int [] countBits(int n){
        int [] ans = new int[n+1];

        for(int i = 0; i <= n; i++){
            ans[i] = count1s(i);
        }
        return ans;
    }
    public static int count1s(int n){
        int count = 0;
        while(n!= 0){
            count++;
            n = n& (n-1);
        }
        return count;
    }
    
}
