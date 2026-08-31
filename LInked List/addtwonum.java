class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
public class addtwonum {
    static int firstval(node head){
        if(head==null){
            return -1;
        }
        return head.data;
    }
    static node delete(node head){
        if(head==null){
            return null;
        }
        head=head.next;
        return head;
    }
    static int sum(int x,int y){
        return x+y;
    }
    static node insert(node head ,int data){
        node newnode=new node(data);
        if(head==null){
            return newnode;
        }
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        return head;
    }
    static node operation(node c,node m){
        node k=null;
        int q=0;
        while(c!=null && m!=null){
            int r=firstval(c);
            int t =firstval(m);
            if(r==-1 ||t==-1){
                break;
            }
            c=delete(c);
            m=delete(m);
            int s=sum(r, t)+q;
            if(s>=10){
                if(firstval(c)==-1 && firstval(m)==-1){
                    int o=s/10;
                    int u=s%10;
                    k=insert(k,u);
                    if(o!=0){
                    k=insert(k,o);}
                    break;
                }
                q=s/10;
                if(q==0){
                    q=0;
                }
                int rem=s%10;
                k=insert(k,rem);
            }
            else{
                k=insert(k,s);
                q=0;
            }
        }
        while(c==null && m!=null){
            int t =firstval(m);
            if(t==-1){
                break;
            }
            m=delete(m);
            int s=sum(t,q);
            if(q>0){
                if(firstval(m)==-1){
                    int o=s/10;
                    int u=s%10;
                    k=insert(k,u);
                    if(o!=0){
                    k=insert(k,o);}
                    break;
                }
                q=s/10;
                if(q==0){
                    q=0;
                }
                int rem=s%10;
                k=insert(k,rem);
            }
            else{
                k=insert(k, t);
                q=0;
            }
        }
        while(m==null && c!=null){
            int t =firstval(c);
            if(t==-1){
                break;
            }
            c=delete(c);
            int s=sum(t,q);
            if(q>0){
                if(firstval(c)==-1){
                    int o=s/10;
                    int u=s%10;
                    k=insert(k,u);
                    if(o!=0){
                    k=insert(k,o);}
                    break;
                }
                q=s/10;
                if(q==0){
                    q=0;
                }
                int rem=s%10;
                k=insert(k,rem);
            }
            else{
                k=insert(k,t);
                q=0;
            }
        }
        return k;
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
    public static void main(String[] args) {
        node head=new node(5);
        //head=insert(head, 9);
        //head=insert(head, 1);
        //head=insert(head, 9);
        //head=insert(head, 9);
        //head=insert(head, 9);
        //head=insert(head, 9);
        node tail=new node(10);
        //tail=insert(tail,2);
        //tail=insert(tail, 1);
        //tail=insert(tail, 9);
        node ok=operation(head, tail);
        printarr(ok);
    }   
}
