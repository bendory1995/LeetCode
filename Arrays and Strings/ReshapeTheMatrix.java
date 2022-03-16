public class ReshapeTheMatrix {
    public static void main(String[] args){

    }
    public int [][] matrixReshape(int[][] mat, int r, int c){
        if(mat.length * mat[0].length != r*c) return mat;
        
        int ans [][] = new int[r][c];
        int x = 0;
        int y = 0;

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                ans[x][y] = mat[i][j];
                y = (y+1)%c;
                if(y == 0)x++;
            }
        }
        return ans;
    } 
}
