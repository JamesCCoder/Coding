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
    int res = -10;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return res;
    }
    
    public int helper(TreeNode node){
        if(node == null){
            return 0;
        }
        
        int l = helper(node.left);
        int r = helper(node.right);
        
        res = Math.max(res , node.val + l + r);
        int max = Math.max(node.val + l, node.val + r);
        return max < 0 ? 0 : max;
    }
}