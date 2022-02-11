public class SubtreeOfAnotherTree {
    public static void main(String[] args){
        
    }
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(){}
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }
    public static boolean isSubtree(TreeNode root, TreeNode subRoot){
        if(root == null){
            return false;
        }else if(isSame(root, subRoot)){
            return true;
        }else{
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
    }
    public static boolean isSame(TreeNode root, TreeNode subRoot){
        if(root != null && subRoot == null) return false;
        if(root == null && subRoot != null) return false;
        if(root == null && subRoot == null) return true;

        if(root.val == subRoot.val){
            return isSame(root.left, subRoot.left) && isSame(root.right, subRoot.right);
        }else{
            return false;
        }
    }
}
