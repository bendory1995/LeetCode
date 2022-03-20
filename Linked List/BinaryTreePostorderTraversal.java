import java.util.*;
public class BinaryTreePostorderTraversal {
    List<Integer> list = new ArrayList();
    public static void main(String[] args){

    }

    public static List<Integer> postorderTraversal(TreeNode root){
        if(root == null) return list;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);
        return list;
    }
}
