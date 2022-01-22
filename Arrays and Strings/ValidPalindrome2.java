import java.util.*;
public class ValidPalindrome2{
    public static void main(String[] args){

        //true
        System.out.println(validPalindrome("abca"));
        //false
        System.out.println(validPalindrome("abc"));

    }

    public static boolean validPalindrome(String s){
        int i = 0, j = s.length()-1;

        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return isPalindrome(s, i+1, j) || isPalindrome(s, i , j--);
            }
            i++;
            j--;
        }
        return true;
    }
    public static boolean isPalindrome(String s, int i, int j){
        while (i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
