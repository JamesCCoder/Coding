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
        ListNode first = head;
        ListNode second = head;
        
        while(first != null){
            int m1 = m;
            int n1 = n;
            while(first != null && m1 != 0){
                second = first;
                first = first.next;
                m1--;
            }
            
            while(first != null && n1 != 0){
                first = first.next;
                n1--;
            }
            second.next = first;
        }
        return res.next;
    }
}