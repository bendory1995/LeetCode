public class RansomNote{
    public static void main(String[] args){

    }
    public static boolean canConstruct(String ransomNote, String magazine){
        if(ransomNote.length() > magazine.length()) return false;
        int [] alphabet = new int [26];
        
        for(int i = 0; i < ransomNote.length(); i++){
            alphabet[ransomNote.charAt(i)-'a']++;
        }
        for(int i = 0; i < magazine.length(); i++){
            alphabet[magazine.charAt(i)-'a']--;
        }
        
        for(int i = 0; i < 26; i++){
            if(alphabet[i]> 0) return false;
        }
        return true;
    }
}