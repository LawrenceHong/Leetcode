/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        
        ListNode A = headA;
        while(A != null) {
            A = A.next;
            lenA++;
        }
        ListNode B = headB;
        while(B != null) {
            B = B.next;
            lenB++;
        }
        
        if(lenA > lenB) {
            for(int i = 0; i < lenA-lenB; i++)
                headA = headA.next;
        }
        else {
            for(int i = 0; i < lenB -lenA; i++)
                headB = headB.next;
        }
        
        while(headA != null && headB != null && headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        
        return headA;
    }
}