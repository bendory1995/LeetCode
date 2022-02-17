import java.util.*;
public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args){

    }
    public int lengthOfLongestSubstring(String s){
        Set<Character> hashset = new HashSet<>();

        int slow = 0;
        int fast = 0;
        int max = 0;

        while(fast < s.length()){
            if(!hashset.contains(s.charAt(fast))){
                hashset.add(s.charAt(fast));
                fast++;
                max = Math.max(hashset.size(), max);
            }else{
                hashset.remove(s.charAt(slow));
                slow++;
            }
        }
        return max;
    }
    
}
