import java.util.*;
public class SpiralMatrix {
    public static void main(String[] args){

    }

    public List<Integer> spiralOrder(int [][] matrix){
        List<Integer> list = new ArrayList<>();

        int leftCol = 0;
        int rightCol= matrix[0].length-1;
        int topRow = 0;
        int botRow = matrix.length-1;

        while(leftCol <= rightCol && topRow <= botRow){
            for(int index = leftCol; index <= rightCol; index++){
                list.add(matrix[topRow][index]);
            }
            topRow++;
            for(int index = topRow; index <= botRow; index++){
                list.add(matrix[index][rightCol]);
            }
            rightCol--;
            if(topRow <= botRow){
                for(int index = rightCol; index >= leftCol; index--){
                    list.add(matrix[botRow][index]);
                }
                botRow--;
            }
            if(leftCol <= rightCol){
                for(int index = botRow; index >= topRow; index--){
                    list.add(matrix[index][leftCol]);
                }
                leftCol++;
            }
        }
        return list;


    }
    
}
