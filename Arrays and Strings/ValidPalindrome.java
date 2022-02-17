public class ValidPalindrome {
    public static void main(String[] args){

    }

    public static boolean isPalindrome(String s){
        if(s.length() == 0) return true;
        s = s.toLowerCase();
        int first = 0;
        int last = s.length() -1;

        while(first < last){
            while(first < last && !Character.isLetterOrDigit(s.charAt(first))) first++;
            while(first < last && !Character.isLetterOrDigit(s.charAt(last))) last--;

            if(s.charAt(first) != s.charAt(last)) return false;
            first++;
            last--;
        }
        return true;
    }

}
