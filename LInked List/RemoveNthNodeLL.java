/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        ListNode temp=head;
        int count=0;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        int index=count-n;
    
        if (index==-1){
            return head.next;
        }
        int count2=0;
        ListNode tem=head;
        while(tem.next!=null && count2!=index){
            tem=tem.next;
            count2++;
        }
        if(tem.next==null){
            return null;
        }   
        else{
            if(tem.next.next!=null){
            ListNode dummy=tem.next.next;
            tem.next=dummy;
            }
            else{
                tem.next=null;
            }
        }
        return head;
    }
}
