class node{
    node right;
    node left;
    int data;
    node(int data){
        this.right=null;
        this.left=null;
        this.data=data;
    }
}
public class bstseach{
    static node root=null;
    static void insert(node neww){
        root=inserthelper(root,neww);
    }
    static node inserthelper(node root,node neww){
        int data=neww.data;
        if(root==null){
            return neww;
        }
        else if(root.data<data){
            root.right=inserthelper(root.right, neww);
        }
        else{
            root.left=inserthelper(root.left, neww);
        }
        return root;
    }
    static void display(node root){
        if(root!=null){
            displayhelper(root);
        }
    }
    static void displayhelper(node root){
        if(root==null){
            return;
        }
        displayhelper(root.left);
        System.out.println(root.data);
        displayhelper(root.right);
    }
    static node search(node root,int val){
        if(root==null || root.data==val){
            return root;
        }
        if(root.data<val){
            return search(root.right, val);
        }
        else{
            return search(root.left,val);
        }
    }
    public static void main(String[] args){
        insert(new node(5));
        insert(new node(50));
        insert(new node(51));
        insert(new node(58));
        insert(new node(60));
        insert(new node(98));
        insert(new node(23));
        insert(new node(1));
        insert(new node(500));
        insert(new node(89));
        insert(new node(45));
        insert(new node(12));
        insert(new node(53));
        display(root);
        System.out.println("----------------------------------");
        node ro=search(root, 51);
        if(ro==null){
            System.out.println("Element not found");
        }
        else{
            display(ro);
        }
    }
}