/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode Ph = new ListNode(0);
        Ph.next = head;
        
        ListNode p = Ph;
        ListNode q = head;
        
        while(q != null) {
            if(q.val == val) {
                p.next = q.next;
                q = q.next;
            }
            else {
                p = p.next;
                q = q.next;
            }
        }
        
        return Ph.next;
    }
}