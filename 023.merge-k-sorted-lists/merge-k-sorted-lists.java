/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
            return null;
        if(lists.length == 1)
            return lists[0];
        
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode l1, ListNode l2) {
                return l1.val - l2.val;
            }
        });
        for(ListNode l : lists) {
            if(l != null)
            queue.add(l);
        }
        
        ListNode head = new ListNode(0);
        ListNode node = head;
        while(!queue.isEmpty()) {
            node.next = queue.poll();
            if (node.next.next != null)
                queue.add(node.next.next);
            node = node.next;    
        }
        return head.next;    
    }
}