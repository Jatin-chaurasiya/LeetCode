class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int depth = height(root);
        return depth + 1;
    }
    public static int height(TreeNode root){
        if(root == null || root.left == null && root.right == null) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }
}