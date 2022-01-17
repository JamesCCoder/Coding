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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
         if(inorder==null || postorder==null) {
            return null;
        }
        return helper(inorder,postorder);
    }

    private TreeNode helper(int[] in, int[] post) {
        if(in.length==0) {
            return null;
        }
        //根据后序数组的最后一个元素，创建根节点
        TreeNode root = new TreeNode(post[post.length-1]);
        //在中序数组中查找值等于【后序数组最后一个元素】的下标
        for(int i=0;i<in.length;++i) {
            if(in[i]==post[post.length-1]) {
                //确定这个下标i后，将中序数组分成两部分，后序数组分成两部分
                int[] inLeft = Arrays.copyOfRange(in,0,i);
                int[] inRight = Arrays.copyOfRange(in,i+1,in.length);
                int[] postLeft = Arrays.copyOfRange(post,0,i);
                int[] postRight = Arrays.copyOfRange(post,i,post.length-1);
                //递归处理中序数组左边，后序数组左边
                root.left = helper(inLeft,postLeft);
                //递归处理中序数组右边，后序数组右边
                root.right = helper(inRight,postRight);
                break;
            }
        }
        return root;

    }
}