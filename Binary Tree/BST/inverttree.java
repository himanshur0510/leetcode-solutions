package BST;
class TreeNode {
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
public class inverttree {
    public TreeNode swap(TreeNode root){
        TreeNode lh=root.left;
        TreeNode rh=root.right;
        root.left=rh;
        root.right=lh;
        return root;
    }
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        root=swap(root);
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}