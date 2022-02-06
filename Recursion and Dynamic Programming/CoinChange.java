import java.util.*;

public class CoinChange {
    public static void main(String[] args){


    }

    public static int countCoins(int [] coins, int amount){
        int max = amount +1;
        int [] memo = new int [amount +1];
        Arrays.fill(memo, max);

        memo[0] = 0;

        for(int i = 1; i <= amount; i++){
            for(int j = 0; j < coins.length; j++){
                if(i >= coins[j]){
                    memo[i] = Math.min(memo[i], memo[i-coins[j]] +1);
                }
            }
        }
        if(memo[amount] > amount) return -1;
        else return memo[amount];
    }
    
}
