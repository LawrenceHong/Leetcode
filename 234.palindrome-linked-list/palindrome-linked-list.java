/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        
        ListNode tail = head;
        int len = 0;
        while(tail!=null) {
            tail = tail.next;
            len++;
        }
        
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0; i < len/2; ++i) {
            st.push(head.val);
            head = head.next;
        }
        if(len % 2 == 1)
            head = head.next;
        while(head!=null) {
            if(st.pop() != head.val)
                return false;
            head= head.next;    
        }
        
        return true;
    }
}