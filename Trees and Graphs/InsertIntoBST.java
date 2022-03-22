public class InsertIntoBST {
    public static void main(String[] args){

    }
    public static TreeNode insertIntoBST(TreeNode root, int val){
        if(root == val) return new TreeNode(val);

        if(val < root.val) root.left = insertIntoBST(root.left, val);
        else root.right = insertIntoBST(root.right, val);

        return root;
    }
}
