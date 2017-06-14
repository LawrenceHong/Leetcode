/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;
            
        ListNode fastNode = head.next;
        ListNode slowNode = head;
        
        while(fastNode != slowNode){
            if(fastNode == null || fastNode.next == null)
                return null;
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
        // 一起往下走X步，就找到节点了。
        while (head != slowNode.next) {
            head = head.next;
            slowNode = slowNode.next;
        }
        return head;
    }
}