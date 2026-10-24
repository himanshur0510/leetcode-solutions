/**
 * Definition for a binary tree node.
 
 
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
public class inorderTraversal {
    List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        inorder(root,result);
        return result;
    }
    void inorder(TreeNode root,List<Integer> result){
        if(root==null){
            return;
        }
        inorder(root.left,result);
        result.add(root.val);
        inorder(root.right,result);
    }
    public static void main(String[] args){

}
}*/