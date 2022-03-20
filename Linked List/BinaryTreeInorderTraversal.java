import java.util.*;
public class BinaryTreeInorderTraversal {
    List<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args){
        //left root right

    }

    public static List<Integer> inorderTraversal(TreeNode root){
        if(root == null) return list;
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }
}
