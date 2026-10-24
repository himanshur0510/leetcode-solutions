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
    public int dep(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=dep(root.left);
        int rh=dep(root.right);
        return 1+Math.max(lh,rh);
    }
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return dep(root);
    }
}