import java.util.List;
/**
 * Definition for singly-linked list.
 * public class MiddleNode {
 *     int val;
 *     MiddleNode next;
 *     MiddleNode() {}
 *     MiddleNode(int val) { this.val = val; }
 *     MiddleNode(int val, MiddleNode next) { this.val = val; this.next = next; }
 * }
 */
public class MiddleNode {
      int val;
      MiddleNode next;
      MiddleNode() {}
      MiddleNode(int val) { this.val = val; }
      MiddleNode(int val, MiddleNode next) { this.val = val; this.next = next; }
 }
class Solution {
    public static MiddleNode middleNode(MiddleNode head) {
        MiddleNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int y=count/2;
        int f=0;
        MiddleNode p=head;
        while(y>f && p!=null ){
            f++;
            p=p.next;
        }
        head=p;
        return head;
    }
    static void display(MiddleNode head){
        MiddleNode temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        MiddleNode newnode=new MiddleNode(1);
        newnode.next=new MiddleNode(2);
        newnode.next.next=new MiddleNode(3);
        newnode.next.next.next=new MiddleNode(4);
        newnode.next.next.next.next=new MiddleNode(5);
        newnode=middleNode(newnode);
        display(newnode);
    }
}