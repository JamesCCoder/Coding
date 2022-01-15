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
    public boolean isPalindrome(ListNode head) {
        List<Integer> res = new ArrayList<>();
        
        ListNode cur = head;
        while(cur != null){
            res.add(cur.val);
            cur = cur.next;
        }
        
        
        int s = 0;
        int e = res.size()-1;
        while(s < e){
            if(!res.get(s).equals(res.get(e))){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}