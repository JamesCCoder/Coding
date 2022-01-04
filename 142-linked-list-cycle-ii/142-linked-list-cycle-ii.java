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
        HashSet<ListNode> res = new HashSet<>();
        while(head != null){
            if(res.contains(head)){
                return head;
            }
            res.add(head);
            head = head.next;
        }
        return null;
    }
}