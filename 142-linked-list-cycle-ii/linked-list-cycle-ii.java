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
        ListNode slow = head;
        ListNode fast = head;
        boolean cycle=false;
        while(fast != null && fast.next != null) {
            slow=slow.next;
            fast=fast.next.next;

            if(slow == fast) {
                cycle=true;
                break;
            }
        }

        if(!cycle) {
            return null;
        }

        ListNode tempNode=slow.next;
        int cycleLen=0;
        while(slow != tempNode) {
            cycleLen++;
            tempNode = tempNode.next;
        }

        ListNode ptr=head;
        while(true) {
            for(int it=0;it<=cycleLen;it++) {
                if(tempNode == ptr) {
                    return ptr;
                }
                tempNode = tempNode.next;
            }
            ptr = ptr.next;
        }
    }
}