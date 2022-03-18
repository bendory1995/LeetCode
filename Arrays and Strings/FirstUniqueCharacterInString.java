public class FirstUniqueCharacterInString {
    
    public static void main(String[] args){
        
    }
    public static int firstUniqueCharacter(String s){
        int [] alphabet = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            alphabet[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < s.length(); i++){
            if(alphabet[s.charAt(i) -'a'] == 1) return i;
        }
        return -1;
    }
}
