/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return head;
            
        ListNode preHead = new ListNode(0);
        ListNode dummy = preHead;
        preHead.next = head;
        ListNode chead = head;
        int len = 0;
        
        while(chead != null) {
            chead = chead.next;
            len++;
        }
        for(int i = 0; i < len - n; i++) {
            head = head.next;
            preHead = preHead.next;
        }
        
        preHead.next = head.next;
        
        return dummy.next;
    }
}