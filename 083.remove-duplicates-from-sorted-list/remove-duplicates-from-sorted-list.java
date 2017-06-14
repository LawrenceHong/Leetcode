/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        while(head != null && head.next != null) {
            if(head.val == head.next.val)
                deleteNode(head);
            else    
                head = head.next;    
        }
        
        return pre.next;
    }
    
    public void deleteNode(ListNode node) {
        node.next = node.next.next;
    }
}