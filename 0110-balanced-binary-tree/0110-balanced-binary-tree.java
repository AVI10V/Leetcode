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
    public boolean isBalanced(TreeNode root) {
        return recur(root)!=-1;
    }
    public int recur(TreeNode root){
      if(root==null)return 0;
      int left =recur(root.left);
      if(left==-1)return -1;
      int right=recur(root.right);
      if(right==-1)return -1;
      if(Math.abs(left-right)>1)return -1;
      return Math.max(left , right)+1;
    }
}