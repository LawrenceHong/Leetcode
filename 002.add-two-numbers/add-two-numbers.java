/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /*
       ListNode head = null;
       ListNode tail = null;
       
       int carry = 0;
       while(l1!=null || l2!=null) {
           int vl1 = 0;
           if(l1 == null)
                vl1 = 0;
           else
                vl1 = l1.val;
                
           int vl2 = 0;
           if(l2 == null)
                vl2 = 0;
           else
                vl2 = l2.val;
                
            ListNode node = new ListNode((vl1 + vl2 + carry)%10);
            carry = (vl1 + vl2 + carry)/10;
            if(head ==null)
                head = tail = node;
            else {
                tail.next = node;
                tail = node;
            }
            if(l1!=null)
                l1 = l1.next;
            if(l2!=null)
                l2 = l2.next;
       }
       
       if(l1 == null && l2 ==null && carry == 1) {
            ListNode end = new ListNode(1);
            tail.next = end;
       }
       return head;*/
        if(l1 == null && l2 == null) {
            return null;
        }
            
        ListNode head = new ListNode(0);
        ListNode point = head;
        int carry = 0;
        while(l1 != null && l2!=null){
            int sum = carry + l1.val + l2.val;
            point.next = new ListNode(sum % 10);
            carry = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
            point = point.next;
        }
        
        while(l1 != null) {
            int sum =  carry + l1.val;
            point.next = new ListNode(sum % 10);
            carry = sum /10;
            l1 = l1.next;
            point = point.next;
        }
        
        while(l2 != null) {
            int sum =  carry + l2.val;
            point.next = new ListNode(sum % 10);
            carry = sum /10;
            l2 = l2.next;
            point = point.next;
        }
        
        if (carry != 0) {
            point.next = new ListNode(carry);
        }
        return head.next;
    }
}