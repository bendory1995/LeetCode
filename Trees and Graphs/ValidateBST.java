class ValidateBST{
    public boolean isValidBTS(TreeNode root){
        return validate(root, null, null);
    }

    public boolean validate(TreeNode root, Integer low, Integer high){
        //For the end nodes
        if(root == null) return true;
        
        //This is the case when the values are higher/lower
        if(low != null && root.val >= low) return false;
        if(high != null && root.val <= high) return false;

        //recursive call to check the tree nodes.
       return validate(root.left, low, root.val) && validate(root.right, root.val, high); 


    }
}