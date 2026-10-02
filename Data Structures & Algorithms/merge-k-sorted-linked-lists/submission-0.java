class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
      List<Integer> list= new ArrayList<>();

      if(lists.length == 0) return null;

      for(ListNode l : lists)
      {
        ListNode curr = l;
        while(curr != null)
        {
            int k = curr.val;
            list.add(k);
            curr = curr.next;
        }
      }

      Collections.sort(list);

      ListNode  result= new ListNode(-1);
      ListNode curr=result;

      for(int val:list)
      {
        ListNode node= new ListNode(val);
        curr.next=node;
        curr=curr.next;
      }

      return result.next;
    }
}
