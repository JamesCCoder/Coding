/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(0, head);
        ListNode l1 = res;
        ListNode l2 = res;
        for(int i = 1; i<= n + 1; i++){
            l1 = l1.next;
        }
        while(l1 != null){
            l1 = l1.next;
            l2 = l2.next;
        }
        l2.next = l2.next.next;
        return res.next;
    }
    
}