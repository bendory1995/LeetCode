import java.util.*;

public class ValidSudoku {
    public static void main(String[] args){

    }
    public static boolean isValidSudoku(char[][] board){

        for(int i = 0;i < board.length; i++){
            Set <Character> rowSet = new HashSet<>();
            Set <Character> colSet = new HashSet<>();
            Set <Character> boxSet = new HashSet<>();

            for(int j = 0; j < board[0].length; j++){
                if(board[i][j]!= '.' && !rowSet.add(board[i][j])) return false;
                if(board[j][i]!= '.' && !colSet.add(board[j][i])) return false;

                int row = (i/3)*3;
                int col = (i%3)*3;

                if(board[row + j/3][col + j%3]!= '.' && !boxSet.add(board[row+j/3][col + j%3]))return false;
           }
        }
        return true;
    }
    
}
