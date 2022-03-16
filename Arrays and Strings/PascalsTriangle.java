import java.util.*;
public class PascalsTriangle {
    public static void main(String[] args){

    }

    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        list.add(firstRow);
        
        if(numRows == 1) return list;

        for(int i = 1; i < numRows; i++){
            List<Integer> nextRow = new ArrayList<>();
            List<Integer> prevRow = list.get(i-1);
            nextRow.add(1);
            for(int j = 1; j < i ; j++){
                nextRow.add(prevRow.get(j-1) + prevRow.get(j));
            }
            nextRow.add(1);
            list.add(nextRow);
        }
    }
    
}
