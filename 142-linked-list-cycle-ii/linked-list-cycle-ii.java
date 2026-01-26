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
        ListNode ptr = head;
        Set<ListNode> nodeSet = new HashSet<>();
        while(ptr != null) {
            nodeSet.add(ptr);
            ptr=ptr.next;
            if(nodeSet.contains(ptr)) {
                return ptr;
            }
        }
        return null;
    }
}