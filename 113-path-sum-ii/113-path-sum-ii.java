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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> out = new ArrayList<>();
        helper(root, targetSum, out, res);
        return res;
                                             
    }
    
    public void helper(TreeNode node, int sum, List<Integer> out, List<List<Integer>> res){
        if(node == null) return;
        out.add(node.val);
        
        if(node.left == null && node.right == null && node.val == sum){
            res.add(new ArrayList(out));
        }else{
            helper(node.left, sum - node.val, out, res);
            helper(node.right, sum - node.val, out, res);
        }
        out.remove(out.size()-1);
    }
}