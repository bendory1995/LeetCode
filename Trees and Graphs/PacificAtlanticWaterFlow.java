import java.util.*;

public class PacificAtlanticWaterFlow {
    public static void main(String[] args){

    }
    public static List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        List<List<Integer>> list = new ArrayList();
        
        boolean [][] pacific = new boolean[m][n];
        boolean [][] atlantic = new boolean[m][n];
        
        //initialize
        for(int i = 0; i < m; i++){
            pacific[i][0] = true;
        }
        for(int j = 0; j < n; j++){
            pacific[0][j] = true;
        }
        
        for(int i = 0; i < m; i++){
            atlantic[m-1][i] = true;
        }
        for(int j = 0; j < n; j++){
            atlantic[j][n-1] = true;
        }
        
        //do work
        for(int i = 0; i < m; i ++){
            for(int j = 0; j < n; j++){
                canP(pacific, i, j, m, n , heights);
            }
        }
        for(int i = m-1; i >= 0; i--){
            for(int j = n-1; j >= 0; j--){
                canA(atlantic, i, j, m, n , heights);
            }
        }

        // printgrid(pacific);
        // System.out.println("-----------");
        // printgrid(atlantic);
        //put in arraylist
        for(int i = 0; i < m; i ++){
            for(int j = 0; j < n; j++){
                if(pacific[i][j] && atlantic[i][j]){
                    List<Integer> pair = new ArrayList();
                    pair.add(i);
                    pair.add(j);
                    list.add(pair);
                }
            }
        }
        return list;
    }

    public static void canP(boolean[][] pacific, int i, int j, int m, int n, int[][] heights){
        if(i < 0 || j < 0 || i > m-2 || j > n-2) return;
        if(pacific[i][j] && heights[i+1][j] >= heights[i][j]){
            pacific[i+1][j] = true;
        } 
        if(pacific[i][j] && heights[i][j+1] >= heights[i][j]){
            pacific[i][j+1] = true;
        }   
        canP(pacific, i+1, j, m, n, heights);
        canP(pacific, i, j+1, m, n, heights);

        
        
    }
    public static void canA(boolean[][] atlantic,int i, int j, int m, int n, int [][] heights){
        if(i < 1 || j < 1 || i > m-1 || j > n-1) return;
        if(atlantic[i][j] && heights[i-1][j] >= heights[i][j]){
            atlantic[i-1][j] = true;
        } 
        if(atlantic[i][j] && heights[i][j-1] >= heights[i][j]){
            atlantic[i][j-1] = true;
        } 
        canA(atlantic, i-1, j, m, n, heights);
        canA(atlantic, i, j-1, m, n, heights);

        
    }
}
