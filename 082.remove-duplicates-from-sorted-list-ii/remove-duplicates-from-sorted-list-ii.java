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
        ListNode previous = new ListNode(0);
        previous.next = head;
        
        ListNode start = previous;
        ListNode cur = head;
        
        while(cur != null) {
            while(cur.next != null && cur.next.val == cur.val) {
                cur = cur.next;
            }
            if(start.next == cur){
                start = start.next;
            }
            else {
                start.next = cur.next;
            }
            cur = cur.next;
        }
        
        return previous.next;
    }
}