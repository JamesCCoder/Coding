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
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode res = new ListNode(0, head);
        ListNode first = res.next;
        ListNode second = res.next;
        
        while(first != null){
            int mCount = m;
            int nCount = n;
            while(first != null && mCount != 0){
                second = first;
                first = first.next;
                mCount--;
            }
            
            while(first != null && nCount != 0){
                first = first.next;
                nCount--;
            }
            
            second.next = first;
        }
        return res.next;
    }
}