/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode even_head = even;
        while (even != null && even.next != null) {
            odd = odd.next = even.next;
            even = even.next = odd.next;
        }
        odd.next = even_head;
        return head;
    }
}