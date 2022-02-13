public class DesignAddSearchWords {

    public static void main(String[] args){

    }
    public static class TrieNode{
        TrieNode [] children = new TrieNode[26];
        boolean isWord;
    }

    public static class WordDictionary{
        TrieNode root;
        public WordDictionary(){
            root = new TrieNode();
        }
        public void addWOrd(String word){
            TrieNode node = root;
            
            for(int i = 0; i < word.length(); i++){
                if(node.children[word.charAt(i)-'a'] == null){
                    node.children[word.charAt(i)-'a'] = new TrieNode();
                }
                node = node.children[word.charAt(i)-'a'];
            }
            node.isWord = true;
        }
        public boolean search(String word){
            TrieNode node = root;
            return find(word, node, 0);
        }
        public boolean find(String word, TrieNode node, int index){
            if(index == word.length()) return node.isWord;

            if(word.charAt(index) == '.'){
                for(int i = 0; i< 26; i++){
                    if(node.children[i] != null && find(word, node.children[i], index+1))return true;
                }
                return false;
            }else{
                return (node.children[word.charAt(index)-'a']!= null && find(word, node.children[word.charAt(index)-'a'], index+1));
            }
        }
        
    }

}
