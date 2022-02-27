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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode res = new ListNode(0, head);
        ListNode cur = res;
        
        while(cur.next != null && cur.next.next != null){
            if(cur.next.val == cur.next.next.val){
                int n = cur.next.val;
                while(cur.next != null && cur.next.val == n){
                    cur.next = cur.next.next;
                }
            }else{
                cur = cur.next;
            }
        }
        return res.next;
    }
}