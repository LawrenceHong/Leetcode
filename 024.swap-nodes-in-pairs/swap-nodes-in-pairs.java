/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        
        ListNode previous = new ListNode(0);
        ListNode node = previous;
        ListNode next = null;
        while(head != null) {
            if(stack.size() < 2) {
                next = head.next;
                head.next = null;
                stack.push(head);
                head = next;
            }
            if(stack.size() == 2) {
                node.next = stack.pop();
                node = node.next;
                node.next = stack.pop();
                node = node.next;
            }
        }
        
        if(stack.size() != 0)
            node.next = stack.pop();
        return previous.next;
    }
}