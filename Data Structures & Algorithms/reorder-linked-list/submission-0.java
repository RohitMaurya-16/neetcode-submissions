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
    public void reorderList(ListNode head) {



      //Find the middle of the linked list by using slow and fast pointer

      ListNode slow=head;
      ListNode fast=head;

      while(fast!=null && slow!=null && fast.next!=null)
      {
        slow=slow.next;
        fast=fast.next.next;
      }

      // Now slow pointer is having middle value

      // reverse the next half from slow to end

      ListNode prev=null;
      ListNode curr=slow;

      while(curr!=null)
      {
        ListNode next= curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
      }
    
    // Now prev contains second half

    ListNode first= head;
    ListNode second=prev;

    while(second.next!=null)
    {
        ListNode temp1=first.next;
        ListNode temp2=second.next;

        first.next=second;
        second.next=temp1;

        first=temp1;
        second=temp2;
    }

    return;
    }
}
