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
    public boolean isValidBST(TreeNode root) {
        if(root==null)return true;
        Long left=Long.MIN_VALUE;
        Long right=Long.MAX_VALUE;
        return helper(root,left,right);  
    }
    public boolean helper(TreeNode root, long l, long r){
        if(root==null)return true;
        if(root.val>=r || root.val<=l)return false;
       return helper(root.left,l,root.val)&&helper(root.right,root.val,r);

    }
}