/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        
        ListNode H = head;
        ArrayList array = new ArrayList();
        
        while(H != null) {
            array.add(H.val);
            H = H.next;
        }
        //for(int i = 0; i < array.size(); ++i)
        //System.out.println(array.get(i));
        
        ListNode T = head;
        int i = 0;
        int alen = array.size();
        while(T != null) {
            T.val = (int)array.get(alen - 1 - i++);
            T = T.next;
        }
        
        return head;
    }
}