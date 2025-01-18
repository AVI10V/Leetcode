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
    private int ans =Integer.MAX_VALUE;
    TreeNode prev=null;
    public int getMinimumDifference(TreeNode root) {
        TreeNode prev=null;
        helper(root);
        return ans;
        
    }
    public void helper(TreeNode root ){
        if(root==null)return;
        helper(root.left);
        if(prev!=null){
            ans=Math.min(ans,root.val-prev.val);
        }
        prev=root;
        helper(root.right);
    }
}