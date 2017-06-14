/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        /*
        if(k < 2 || head == null)
            return head;
        
        ListNode newList = new ListNode(0);
        ListNode newHead = newList;
        Stack<ListNode> stack = new Stack<>();
        ListNode next = head;
        while(head != null || stack.size() == k) {
            if(stack.size() != k) {
                stack.push(head);
                head = head.next;
            }
            else {
                next = head;
                while(stack.size() != 0) {
                    newHead.next = stack.pop();
                    newHead = newHead.next;
                }
            }
        }
        newHead.next = next;
        return newList.next;*/
        ListNode curr = head;
    int count = 0;
    while (curr != null && count != k) { // find the k+1 node
        curr = curr.next;
        count++;
    }
    if (count == k) { // if k+1 node is found
        curr = reverseKGroup(curr, k); // reverse list with k+1 node as head
        // head - head-pointer to direct part, 
        // curr - head-pointer to reversed part;
        while (count-- > 0) { // reverse current k-group: 
            ListNode tmp = head.next; // tmp - next head in direct part
            head.next = curr; // preappending "direct" head to the reversed list 
            curr = head; // move head of reversed part to a new node
            head = tmp; // move "direct" head to the next node in direct part
        }
        head = curr;
    }
    return head;
    }
    
}