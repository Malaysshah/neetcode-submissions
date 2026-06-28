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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        else if(l2==null)
            return l1;
        else
        {
            ListNode result=l1.val<l2.val?l1:l2;
            result.next=mergeTwoLists(l1.val<l2.val?l1.next:l1,l1.val<l2.val?l2:l2.next);
            return result;
        }

    }
}