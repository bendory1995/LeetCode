public class RotateImage {
    public static void main(String[] args){

    }

    public static void rotate(int [][] matrix){
        transpose(matrix);
        swapLeftRight(matrix);
    }

    public static void transpose(int [][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = i+1; j < matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]= temp;
            }
        }
    }

    public static void swapLeftRight(int [][] matrix){
        for(int i = 0; i < matrix.length; i++){
            int first = 0;
            int last = matrix[0].length-1;
            while(first < last){
                int temp = matrix[i][first];
                matrix[i][first] = matrix[i][last];
                matrix[i][last] = temp;
                first++;
                last--;
            }
        }
    }
}

