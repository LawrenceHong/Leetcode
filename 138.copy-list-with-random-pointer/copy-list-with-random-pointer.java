/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null)
            return null;
            
        RandomListNode dummy = new RandomListNode(0);
        dummy.next = head;
        RandomListNode p = dummy;
        HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
        while(head != null) {
            RandomListNode node = new RandomListNode(head.label);
            p.next = node;
            p = node;
            
            node.random = head.random;
            map.put(head, node);
            head = head.next;
        }
        
        head = dummy.next;
        while(head != null) {
            if(head.random != null)
                head.random = map.get(head.random);
            
            head = head.next;    
        }
        
        return dummy.next;
    }
}