/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
            
        ListNode head = null;
        ListNode tail = null;
        while(l1 != null && l2 != null) {
            ListNode node = new ListNode(Math.min(l1.val, l2.val));
            if(head == null)
                tail = head = node;
            tail.next = node;    
            tail = node;
            
            if(l1.val >= l2.val)
                l2 = l2.next;
            else    
                l1 = l1.next;
        }
        if(l1 != null)
            tail.next = l1;
        if(l2 != null)
            tail.next = l2;
        return head;    
    }
}