import java.util.*;
public class KthSmallestElementBST{
    public static void main(String[] args){

    }
    public static int kthSmallest(TreeNode root, int k){
        List<Integer> list = new ArrayList<Integer>();
        dfs(root, list);
        Collections.sort(list);
        return list.get(k-1);
    }
    public static void dfs(TreeNode root, List<Integer> list){
        if(root == null) return;
        list.add(root.val);
        dfs(root.left, list);
        dfs(root.right, list);
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
}