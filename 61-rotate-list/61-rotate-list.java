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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        int n = 1;
        ListNode cur = head;
        while(cur.next != null){
            n++;
            cur = cur.next;
        }
        
        cur.next = head;
        int m = n - k % n;
        for(int i = 0; i<m; i++){
            cur = cur.next;
        }
        ListNode res = cur.next;
        cur.next = null;
        return res;
    }
}