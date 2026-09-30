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
       
       if(head==null)return null;

       ListNode prev=null;
       ListNode curr=head;

       while(curr!=null)
       {
        ListNode next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
       }


       ListNode result= new ListNode(0);
       result.next=prev;
       curr=result;
       int count=1;
       while(curr!=null)
       {
           if(count==n)
           {
            curr.next=curr.next.next;
           }
           count++;
           curr=curr.next;
       }

       prev=null;
       curr=result.next;

       while(curr!=null)
       {
        ListNode next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
       }

       return prev;
    }
}
