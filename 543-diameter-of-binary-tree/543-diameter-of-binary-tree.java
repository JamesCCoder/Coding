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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int[] diameter = new int[1];
        helper(root, diameter);
        return diameter[0];
        
    }
    
    public int helper(TreeNode node, int[] diameter){
        if(node == null) return 0;
        int l = helper(node.left, diameter);
        int r = helper(node.right, diameter);
        diameter[0] = Math.max(diameter[0], l+r);
        return Math.max(l, r) +1;
    }
}