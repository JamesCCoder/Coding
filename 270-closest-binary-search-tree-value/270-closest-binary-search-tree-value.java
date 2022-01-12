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
    int val = Integer.MAX_VALUE;
    public int closestValue(TreeNode root, double target) {
        
        if (root == null) return 0;
        if (Math.abs(val - target) > Math.abs(root.val - target)){
            val = root.val;
        }
        closestValue(root.left, target);
        closestValue(root.right, target);
        return val;
    }
}