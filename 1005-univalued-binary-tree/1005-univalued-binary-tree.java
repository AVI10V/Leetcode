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
    public boolean isUnivalTree(TreeNode root) {
    int x=root.val;
    return helper(root,x);
    
        
    }
    public boolean helper(TreeNode root, int x){
        if(root==null)return true;
        if(root.val!=x)return false;
        boolean l=helper(root.left,x);
        if(l==false)return false;
        boolean r=helper(root.right,x);
        return l & r;
    }
}