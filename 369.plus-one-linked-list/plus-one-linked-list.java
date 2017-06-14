/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode plusOne(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        Stack<ListNode> stack = new Stack<>();
        
        stack.push(pre);
        while(head != null) {
            stack.push(head);
            head = head.next;
        }
        
        int carry = 1;
        while(carry != 0) {
            ListNode node = stack.pop();
            carry = (node.val+1)/10;
            node.val = (node.val+1)%10;
        }
        
        return pre.val == 0 ? pre.next : pre;
    }
}