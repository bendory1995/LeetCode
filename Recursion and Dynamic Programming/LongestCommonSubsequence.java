public class LongestCommonSubsequence{
    public static void main(String[] args){

    }
    public static int lcs(String s1, String s2){
        int [][] dpGrid = new int [s1.length()+1][s2.length()+1];
        
        for(int i = s1.length()-1; i >= 0; i--){
            for(int j = s2.length()-1; j >= 0; j--){
                if(s1.charAt(i) == s2.charAt(j)){
                    dpGrid[i][j] = 1 + dpGrid[i+1][j+1];
                }
                else{
                    dpGrid[i][j] = Math.max(dpGrid[i+1][j], dpGrid[i][j+1]);
                }
            }
        }
        return dpGrid[0][0];
    }
}