public class DecodeWays {
    public static void main(String[] args){

    }
    
    public static int numDecodings(String s){
        int [] memo = new int [s.length() +1];

        //basecase
        //memo[0] = 1 because 0! = 0
        //theory of computation
        //similar to Factorial(0) = 1;
        memo[0] = 1;
        if(s.charAt(0) == '0'){
            memo[0] = 0;
        }else{
            memo[1] = 1;
        }

        for(int i = 2; i <= s.length(); i++){
            int oneDigit = Integer.valueOf(s.substring(i-1, i));
            int twoDigit = Integer.valueOf(s.substring(i-2, i));

            if(oneDigit >= 1) memo[i] = memo[i] + memo[i-1];
            if(twoDigit >= 10 && twoDigit <= 26) memo[i] = memo[i] + memo[i-2];

        }
        return memo[s.length()];


    }
}
