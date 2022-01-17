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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length == 0){
            return null;
        }
        
        TreeNode res = new TreeNode(preorder[0]);
        for(int i = 0; i<preorder.length; i++){
            if(preorder[0] == inorder[i]){
                int[] pre_left = Arrays.copyOfRange(preorder,1,i+1);
				int[] pre_right = Arrays.copyOfRange(preorder,i+1,preorder.length);
				int[] in_left = Arrays.copyOfRange(inorder,0,i);
				int[] in_right = Arrays.copyOfRange(inorder,i+1,inorder.length);
				res.left = buildTree(pre_left,in_left);
				res.right = buildTree(pre_right,in_right);
				break;

            }
        }
        return res;
    }
}