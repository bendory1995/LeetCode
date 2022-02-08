import java.util.*;
public class WordBreak {
    public static void main(String[] args){

    }
    public static boolean wordBreakMemo(String s, List<String> wordDict){
        int length = s.length();
        boolean[] dp = new boolean[length + 1];
        
        dp[0] = true;
        for(int i = 0; i <= length; i++){
            for(int j = 0; j < i; j++){
                if(dp[j] && wordDict.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[length];
    }
}
