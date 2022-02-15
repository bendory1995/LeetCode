public class SetMatrixZeroes{
    public static void main(String[] args){

    }

    public static void setZeroes(int [][] matrix){
        boolean [][] changed = new boolean[matrix.length][matrix[0].length];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    changeRow(matrix, i, j, changed);
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(changed[i][j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void changeRow(int [][] matrix, int i, int j, boolean[][] changed){
        for(int x = 0; x < matrix.length; x++){
            if(x != i && matrix[x][j] != 0){
                changed[x][j] = true;
            }
        }
        for(int y = 0; y < matrix[0].length; y++){
            if(y != j && matrix[i][y] != 0){
                changed[i][y] = true;
            }
        }
    }
}