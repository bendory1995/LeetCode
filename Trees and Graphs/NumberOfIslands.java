public class NumberOfIslands {
    public static void main(String[] args){

    }
    public static int numIslands(char[][] grid){
        int total = 0;

        for(int i = 0;i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    findTotal(grid, i, j);
                    total++;
                }
            }
        }
        return total;
    }

    public static void findTotal(char [][] grid, int i, int j){
        if(i < 0 || i >= grid.length) return;
        if(j < 0 || j >= grid[0].length) return;
        if(grid[i][j] == '0') return;
        
        grid[i][j] = '0';

        findTotal(grid, i+1, j);
        findTotal(grid, i-1, j);
        findTotal(grid, i, j+1);
        findTotal(grid, i, j-1);
    }

}
