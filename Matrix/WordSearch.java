public class WordSearch {
    public static void main(String[] args){

    }

    public static boolean exist(char[][] board, String word){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == word.charAt(0) && find(board, word, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean find(char[][] board, String word, int i, int j, int index){
        if(index == word.length()) return true;

        if(i < 0 || i >= board.length) return false;
        if(j < 0 || j >= board[0].length) return false;
        if(board[i][j] != word.charAt(index)) return false;

        char temp = board[i][j];
        board[i][j] = ' ';
        boolean found = find(board, word, i+1, j, index+1) || 
        find(board, word, i-1, j, index+1) ||
        find(board, word, i, j+1, index+1) ||
        find(board, word, i, j-1, index+1);
    
        board[i][j] = temp;
        return found;

    }
}
