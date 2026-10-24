/**package Binary Tree;
class node{
    node right;
    int data;
    node left;
    node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}
public class validbinary {
    boolean isvalid(node root){
        if(root==null){
            return true;
        }
        if(root.left.data>root.data){
            return false;
        }
        if(root.right.data<=root.data){
            return false;
        }
        isvalid(root.left);
        isvalid(root.right);
    }
    public static void main(String[]args){
        
    }
}*/
