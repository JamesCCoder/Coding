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
    int res;
    public int rangeSumBST(TreeNode root, int low, int high) {
        res = 0;
        helper(root, low, high);
        return res;
    }
    
    public void helper(TreeNode node, int low, int high){
        if(node != null){
            if(low <= node.val && node.val <= high){
                res += node.val;
               
            }
             if(low < node.val){
                    helper(node.left, low, high);
                }
                if(node.val < high){
                    helper(node.right, low, high);
                }
        }
    }
}