import java.util.*;
public class BinaryTreePreorderTraversal {
    List<Integer> list = new ArrayList<>();
    public static void main(String[] args){

    }

    public static List<Integer> preorder(TreeNode root){
        if(root == null) return list;
        list.add(root.val);
        preorder(root.left);
        preorder(root.right);

        return list;
    }
}
