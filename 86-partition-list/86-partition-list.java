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
    public ListNode partition(ListNode head, int x) {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        while(head != null){
            if(head.val < x){
                cur1.next = head;
                cur1 = head;
            }else{
                cur2.next = head;
                cur2 = head;
            }
            head = head.next;
        }
        
        cur2.next = null;
        cur1.next = l2.next;
        
        return l1.next;
    }
}