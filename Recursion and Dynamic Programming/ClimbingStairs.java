public class ClimbingStairs {
    public static void main(String [] args){

    }

    public static int climbStairs(int n){
        int [] memo = new int [n+1];
        return climbCount(n, 0, memo);
    }
    //Memoization TOP DOWN
    public static int climbCount(int n, int count, int [] memo){
        if(n < 0) return 0;
        if(n == 0) return 1;
        //this means it's already calculated
        if(memo[n] != 0) return memo[n];
        
        memo[n] = climbCount(n-1, count+1, memo) + climbCount(n-2, count+1, memo);
        return memo[n];
    }

    //without Memoization
    public static int climbCount2(int n, int count){
        if(n < 0) return 0;
        if(n == 0) return 1;
        return climbCount2(n-1, count+1) + climbCount2(n-2, count+1);
    }

    //BOTTOM UP DYNAMIC PROGRAMMING
    public static int climbCount3(int n){
        if(n == 1) return 1;
        int [] dp = new int [n + 1];

        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];

    }

}
