
class Solution {
    public void flatten(TreeNode root) {
        if(root == null) return;
        TreeNode leftf = root.left;
        TreeNode rightf = root.right;      
        root.left = null;
        flatten(leftf);
        flatten(rightf);
        
        root.right = leftf;
        TreeNode temp = root;
        while(temp.right != null){
            temp = temp.right;
        }
        if(temp != null){
        temp.right = rightf;
        }else{
            root.right = rightf;
        }

    }
}