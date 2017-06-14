/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null)
            return head;
            
        ListNode leftDummy = new ListNode(0);
        ListNode leftHead = leftDummy;
        ListNode rightDummy = new ListNode(0);
        ListNode rightHead = rightDummy;
        
        while(head != null) {
            if(head.val < x) {
                leftHead.next = head;
                leftHead = leftHead.next;
            }
            if(head.val >= x) {
                rightHead.next = head;
                rightHead = rightHead.next;
            }
            head = head.next;
        }
        
        rightHead.next = null;
        leftHead.next = rightDummy.next;
        
        return leftDummy.next;
    }
}