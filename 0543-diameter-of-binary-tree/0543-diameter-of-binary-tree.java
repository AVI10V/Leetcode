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
    int max =Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        recur(root);
        return max;
    }
    public int recur(TreeNode root){
        if(root==null)return 0;
        int l=recur(root.left);
        int r=recur(root.right);
        max=Math.max(l+r , max);
        return 1+Math.max(l,r);
    }
    
}