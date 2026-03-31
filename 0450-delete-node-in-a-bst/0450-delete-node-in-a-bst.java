class Solution {
    public void delete(TreeNode root,int target){
        if(root == null) return;
        if(root.val > target){
          if(root.left == null) return;
          if(root.left.val == target){
            TreeNode l = root.left;
            if(l.left == null && l.right == null) root.left =  null;
            else if(l.left == null || l.right == null){
                if(l.left != null) root.left = l.left;
                else root.left = l.right;
            }else{ // 2child
                TreeNode curr = l;
                TreeNode pred = curr.left;
                while(pred.right != null) pred = pred.right;
                delete(root,pred.val);
                pred.left = curr.left;
                pred.right = curr.right;
                root.left = pred;
            }
          }else{
            delete(root.left,target);
          }
        }else{
            if(root.right == null) return;
            if(root.right.val == target){
           TreeNode r = root.right;
           if(r.right == null && r.left == null) root.right =  null;
           else if(r.right == null || r.left == null){
            if(r.right != null) root.right = r.right;
            else root.right = r.left; 
           }else{//2 child
            TreeNode curr = r;
                TreeNode pred = curr.left;
                while(pred.right != null) pred = pred.right;
                delete(root,pred.val);
                pred.left = curr.left;
                pred.right = curr.right;
                root.right = pred;
           }
           }else{
            delete(root.right,target);
           }
        }
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode dummy = new TreeNode(Integer.MAX_VALUE);
        dummy.left = root;
        delete(dummy,key);
        return dummy.left;
    }
}