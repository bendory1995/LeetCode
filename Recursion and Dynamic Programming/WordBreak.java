import java.util.*;
public class WordBreak {
    public static void main(String[] args){

    }
    //Bottom Up Solution
    public static boolean wordBreakDP(String s, List<String> wordDict){
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
    //Recursive Solution with Memoization
    public boolean wordBreakMemo(String s, Set<String> wordDict, int start, Boolean [] memo){
        if(start == s.length()) return true;
        if(memo[start] != null) return memo[start];
        
        for(int end = start + 1; end < s.length() + 1; end++){
            if(wordDict.contains(s.substring(start, end)) && wordBreakMemo(s, wordDict, end, memo)){
                return memo[start] = true;
            }
        }
        return memo[start] = false;
    }
}
