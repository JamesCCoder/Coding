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
    public int pathSum(TreeNode root, int sum) {
         if(root == null){
               return 0;
        }
         return dfs(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
     }
     
     private int dfs(TreeNode root, int sum){
         int res = 0;
         if(root == null){
             return res;
         }
         
         sum -= root.val;
         if(sum == 0){
             res++;
         }
         res += dfs(root.left, sum) + dfs(root.right, sum);
         return res;
    }
}