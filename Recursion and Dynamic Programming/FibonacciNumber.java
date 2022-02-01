public class FibonacciNumber{
    public static void main(String[] args){
        
    }

    //finding nth fibonacci number
    // f(0) = 0
    // f(1) = 1
    // f(2) = f(1) + f(0) = 0 + 1 = 1
    // f(3) = f(1) + f(2) = 1 + 1 = 2
    // f(4) = f(2) + f(3) = 1 + 2 = 3

    //Regular Fibonacci Number using recursive call O(2^n)
    public static int fibRegular(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fibRegular(n-1) + fibRegular(n-2);
    }

    //Dynamic Programming O(n) Space of O(n) Time as well .
    public static int fibDP(int n){
        //return answer if n is 0 or 1
        if(n == 0) return 0;
        if(n == 1) return 1;

        //Base memo.
        int [] memo = new int [n];
        memo[0] = 0;
        memo[1] = 1;

        //algorithm
        for(int i = 2; i < n; i++){
            if(memo[i] == 0){
                memo[i] = memo[i-1] + memo[i-2];
            }
        }
        return memo[n-1] + memo[n-2];
    }

    //Dynamic Programming O(n) Time, but O(1) Space Complexity!
    //We don't need to save it all 
    public static int fibSuper(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        int a = 0;
        int b = 1;
        
        for(int i = 2; i < n; i++){
            int c = a + b;
            a = b;
            b = c;
        }
        return a + b;
    }
}