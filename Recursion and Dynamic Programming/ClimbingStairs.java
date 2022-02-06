public class ClimbingStairs {
    public static void main(String [] args){

    }

    public static int climbStairs(int n){
        int [] memo = new int [n+1];
        return climbCount(n, 0, memo);
    }
    //Memoization
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

}
