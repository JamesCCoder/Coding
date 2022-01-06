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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode res = new ListNode(0);
        res.next = head;
        
        ListNode a = res;
        ListNode b = res.next;
        
        for(int i = 0; i<m-1; i++){
            a = a.next;
            b = b.next;
        }
        
        for(int i = 0; i<n-m; i++){
            ListNode tmp = b.next;
            b.next = b.next.next;
            
            tmp.next = a.next;
            a.next = tmp;
        }
        return res.next;

    }
}