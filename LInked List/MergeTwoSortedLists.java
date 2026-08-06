class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val=val;
    }
    ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }
}
public class MergeTwoSortedLists{
    public static ListNode mergeTwoLists(ListNode list1,ListNode list2){
        ListNode p=new ListNode();
        ListNode temp=p;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                temp.next=list1;
                list1=list1.next;
            }
            else{
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        if(list1==null){
            temp.next=list2;
        }
        if(list2==null){
            temp.next=list1;
        }
        return p.next;
    }
    static void print(ListNode head){
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
    }
    public static void main(String[] args){
        ListNode list1=new ListNode(1);
        list1.next=new ListNode(2);
        list1.next.next=new ListNode(4);
        ListNode list2=new ListNode(1);
        list2.next=new ListNode(3);
        list2.next.next=new ListNode(4);
        ListNode ans=mergeTwoLists(list1,list2);
        print(ans);
    }
}