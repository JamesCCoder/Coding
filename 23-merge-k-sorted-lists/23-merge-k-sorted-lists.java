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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        if(lists.length == 1) return lists[0];
        
        ListNode res = mergeNode(lists[0], lists[1]);
        for(int i = 2; i<lists.length; i++){
            res = mergeNode(res, lists[i]);
        }
        return res;
    }
    
    public ListNode mergeNode(ListNode l1, ListNode l2){
        ListNode list = new ListNode(0);
        ListNode cur = list;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                cur.next = new ListNode(l1.val);
                l1 = l1.next;
            }else{
                cur.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            cur =cur.next;
        }
        if(l1 == null){
            cur.next = l2;
        }
        if(l2 == null){
            cur.next = l1;
        }
        return list.next;
    }
}