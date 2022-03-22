public class SymmetricTree {
    public static void main(String[] args){
        
    }

    public static boolean isSymmetric(TreeNode root){
        return isSame(root.left, root.right);
    }

    public static boolean isSame(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null) return true;
        if(root1 != null && root2 == null) return false;
        if(root1 == null && root2 != null) return false;

        return (root1.val == root2.val) && isSame(root1.left, root2.right) && isSame(root1.right, root2.left);
    }
}