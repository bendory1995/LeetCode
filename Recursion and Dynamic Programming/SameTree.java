public class SameTree {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}

        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    public static void main(String[] args){
        
    }
    public static boolean isSameTree(TreeNode p, TreeNode q){
        //null cases should be dealt FIRST. 
        if(p == null && q != null) return false;
        if(p != null && q == null) return false;
        if(p == null && q == null) return true;

        if(p.val != q.val) return false;


        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    
}
