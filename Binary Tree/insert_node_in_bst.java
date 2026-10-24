import javax.swing.tree.TreeNode;

public /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class insert_node_in_bst {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            return new TreeNode(val);
        }
        else if(root.val>val){
            root.left=insertIntoBST(root.left,val);
        }
        else{
            root.right=insertIntoBST(root.right,val);
        }
        return root;
    }
} {
    
}
