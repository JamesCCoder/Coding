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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    ListNode head;
    
    public TreeNode sortedListToBST(ListNode head) {
        this.head = head;
        return helper(0, sizeOfList(head)-1);
    }
    
    public int sizeOfList(ListNode head){
        ListNode ln = head;
        int c = 0;
        while(ln != null){
            ln = ln.next;
            c++;
        }
        return c;
    }
    
    public TreeNode helper(int l, int r){
        if(l > r) return null;
        int m = (r - l) / 2 + l;
         TreeNode left = this.helper(l, m - 1);

    TreeNode node = new TreeNode(this.head.val);
    node.left = left;


    this.head = this.head.next;

    node.right = this.helper(m + 1, r);
    return node;
        
    }
}