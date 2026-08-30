class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}

public class reorder {
    static int count(node head){
        if (head==null) {
            return 0;
        }
        else{
            int c=0;
            node temp=head;
            while(temp!=null){
                temp=temp.next;
                c++;
            }
            return c;
        }
    }
    static void printarr(node head){
        if(head==null){
            return;
        }
        else{
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    static node insertatindex(node head,int data,int index){
        node newnode=new node(data);
        if(head==null){
            return newnode;
        }
        if (index==0){
            newnode.next=head;
            head=newnode;
            return head;
        }
        node temp=head;
        int u=0;
        while(temp.next!=null && u<index-1){
            temp=temp.next;
            u++;
        }
        if(temp!=null){
            newnode.next=temp.next;
            temp.next=newnode;
            return head;
        }
        return null;
    }
    static int lastval(node head){
        if(head==null || head.next==null){
            return -500;
        }
        node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        int yk=temp.next.data;
        return yk;
    }
    static node delete(node head){
        if(head==null || head.next==null){
            return null;
        }
        node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        node yk=temp.next;
        temp.next=null;
        return head;
    }
    static node pattern(node head,int index){
        int jk=lastval(head);
        if(jk!=-500){
            head=delete(head);
        node h=insertatindex(head, jk, index);
        return h;
        }
        else{
            return null;
        }
       
    }
    static node ui(node head){
        int t=0;
        int y=count(head);
        while(t<=y){
            if(t%2==0 && t!=0){
                head=pattern(head, t-1);
            }
            t++;
        }
        return head;
    }
    public static void main(String[] args) {
        node head=new node(1);
        head.next=new node(2);
        head.next.next=new node(3);
        head.next.next.next=new node(4);
        head.next.next.next.next=new node(5);
        head=ui(head);
        printarr(head);
    }
}
