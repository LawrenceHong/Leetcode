/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
            return;
            
        ListNode countNode = head;
        int len = 0;
        while(countNode != null) {
            len++;
            countNode = countNode.next;
        }
        
        if(len == 2) return;
        
        if(len % 2 == 0) len /= 2;
        else len = len/2 + 1;
        
        ListNode leftNode = head;
        for(int i = 0; i < len-1; i++) {
            leftNode = leftNode.next;
        }
        ListNode tmp = leftNode.next;
        leftNode.next = null;
        Stack<ListNode> stack = new Stack<>();
        while(tmp != null) {
            stack.push(tmp);
            tmp = tmp.next;
        }
        System.out.println(stack.size());
        ListNode fackhead = head;
        while(stack.size() != 0) {
            ListNode node = stack.pop();
            node.next = fackhead.next;
            fackhead.next = node;
            fackhead = fackhead.next.next;
        }
    }
}