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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode end = dummy;
        
        while(end.next != null){
            for(int i = 0; i<k && end != null; i++){
                end = end.next;
                
            }
            if(end == null) break;
            ListNode start = pre.next;
            ListNode next = end.next;
            
            end.next = null;
            pre.next = reverse(start);
            
            start.next = next;
            pre = start;
            end = pre;
        }
        return dummy.next;
    }
    
    public ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}