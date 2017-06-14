/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    private ListNode head;
    private HashMap<Integer, Integer> map;
    private int length;
    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        this.head = head;
        ListNode count = head;
        map = new HashMap<>();
        length = 0;
        while(count != null) {
            map.put(length, count.val);
            length++;
            count = count.next;
        }
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        Random random = new Random();
        int s = random.nextInt(length);
        return map.get(s);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */