/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0)
            return head;
            
        ListNode tail = head;
        
        int len = 1;
        while(tail.next != null) {
            len++;
            tail = tail.next;
        }
        
        k = k % len;
        if(k == 0)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode ohead = head;
        //System.out.println(len-k);
        for(int i = 0; i < len - k; i++) {
            head = head.next;
            dummy = dummy.next;
        }
        dummy.next = null;
        tail.next = ohead;
        //System.out.println(len);
        return head;
    }
}