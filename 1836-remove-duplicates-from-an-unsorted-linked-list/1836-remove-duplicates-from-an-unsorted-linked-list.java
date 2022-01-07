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
    public ListNode deleteDuplicatesUnsorted(ListNode head) {
        HashMap<Integer, Integer> r = new HashMap<>();
        for(ListNode i = head; i != null; i = i.next){
            r.put(i.val, r.getOrDefault(i.val, 0) + 1);
        }
        
        /*
         ListNode tmp = head;
         while(tmp != null){
            r.put(tmp.val, r.getOrDefault(tmp.val, 0) + 1);
            tmp = tmp.next;
        }
        */           
    
    
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        
        while(cur.next != null){
            if(r.get(cur.next.val) > 1){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
