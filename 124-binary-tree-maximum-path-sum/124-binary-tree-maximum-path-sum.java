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
    public int maxPathSum(TreeNode root) {
        if(root == null) return 0;
        int[] res = new int[]{Integer.MIN_VALUE};
        helper(root, res);
        return res[0];
    }
    
    public int helper(TreeNode node, int[] res){
        if(node == null) return 0;
        int l = Math.max(helper(node.left, res),0);
        int r = Math.max(helper(node.right, res),0);
        res[0] = Math.max(res[0], node.val + l + r);
        return Math.max(l, r) + node.val;
    }
}