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
        if (l1 == null && l2 == null)
            return null;
        if (l1 == null)
            return l2;
        if(l2 == null)
            return l1;
            
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        
        while(l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }
        
        int sum = 0;
        ListNode node = new ListNode(0);
        while(!stack1.empty() || !stack2.empty()) {
            if(!stack1.empty())
                sum += stack1.pop();
            if(!stack2.empty()) 
                sum += stack2.pop();
            
            //System.out.println(sum);    
            node.val = sum%10;
            ListNode head = new ListNode(sum/10);
            head.next = node;
            node = head;
            sum /= 10;
        }
        
        return node.val == 0 ? node.next : node;
    }
}