import java.util.*;

public class GraphValidTree {
    public static void main(String[] args){

    }
    public static boolean validTree(int n, int [][] edges){
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < n ; i++){
            list.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }

        Map<Integer, Integer> hashmap = new HashMap<>();
        hashmap.put(0,-1);
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        while(!stack.isEmpty()){
            int node = stack.pop();
            for(int neighbor: list.get(node)){
                if(hashmap.get(node) == neighbor){
                    continue;
                }
                if(hashmap.containsKey(neighbor)){
                    return false;
                }
                stack.push(neighbor);
                hashmap.put(neighbor, node);
            }
        }
        return n == hashmap.size();
    }
}
