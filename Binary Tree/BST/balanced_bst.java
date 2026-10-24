package BST;
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
class Solution {
    public int jk(TreeNode root){
        if(root ==null){
            return -1;
        }
        int lheight=jk(root.left);
        int rheight=jk(root.right);
        return 1+Math.max(lheight,rheight);
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int lh=jk(root.left);
        int rh=jk(root.right);
        if((lh-rh)>1 || lh-rh <-1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
}