public class LowestCommonAncestorBST{
    public static void main(String[] args){

    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val < q.val){
            return lowest(root, p, q);
        }else if(p.val > q.val){
            return lowest(root, q, p);
        }
        else{
            return root;
        }
    }
    public static TreeNode lowest(TreeNode root, TreeNode small, TreeNode large){
        if(root == null) return null;
        //if both values are smaller than root
        //means we can ignore the right side of the root.
        if(root.val > small.val && root.val > large.val) return lowest(root.left, small, large);
        if(root.val < small.val && root.val < large.val) return lowest(root.right, small, large);

        return root;
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