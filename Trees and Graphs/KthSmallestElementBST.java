import java.util.*;
public class KthSmallestElementBST{
    public static void main(String[] args){

    }
    public static int kthSmallest(TreeNode root, int k){
        List<Integer> list = new ArrayList<Integer>();
        inOrder(root, list, k);
        return list.get(k-1);
    }
    //Since we know that this is already a binary search tree,
    //inOrder will give you an ordered list from smallest to largest.
    public static void inOrder(TreeNode root, List<Integer> list, int k){
        if(root == null) return;
        if(list.size() == k) return;

        inOrder(root.left, list, k);
        list.add(root.val);
        inOrder(root.right, list, k);
        
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
}