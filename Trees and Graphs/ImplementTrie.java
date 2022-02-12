public class ImplementTrie {
    public static void main(String[] args){

    }

    public static class TrieNode{
        TrieNode[] children = new TrieNode[26];
        boolean isWord;
    }
    public static class Trie{
        TrieNode root;
        public Trie(){
            root = new TrieNode();
        }
        public void insert(String word){
            TrieNode node = root;

            for(int i = 0; i < word.length(); i++){
                if(node.children[word.charAt(i) -'a'] == null){
                    node.children[word.charAt(i) - 'a'] = new TrieNode();
                }
                node = node.children[word.charAt(i)-'a'];
            }
            node.isWord = true;
        }
        public boolean search(String word){
            TrieNode node = root;

            for(int i = 0 ;i < word.length(); i++){
                if(node.children[word.charAt(i) -'a'] == null) return false;
                node = node.children[word.charAt(i) -'a'];
            }
            return node.isWord;

        }
        public boolean startsWith(String prefix){
            TrieNode node = root;
            for(int i = 0 ;i < prefix.length(); i++){
                if(node.children[prefix.charAt(i) -'a'] == null) return false;
                node = node.children[prefix.charAt(i)-'a'];
            }
            return true;
        }
    }
}
