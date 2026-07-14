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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        Queue<ListNode> qu=new PriorityQueue<>((a,b)->a.val-b.val);
        for (ListNode list : lists)
        {
            qu.add(list);
        }
        while(!qu.isEmpty())
        {
            ListNode temp=qu.poll();
            curr.next=temp;
            curr=curr.next;
            if(temp.next!=null)
                qu.add(temp.next);
        }
        return dummy.next;
    }
}
