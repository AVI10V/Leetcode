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
    public int goodNodes(TreeNode root) {
        int max =Integer.MIN_VALUE;
        return helper(root,max);
        
    }
    public int helper(TreeNode root, int max){
        if(root==null)return 0;
        int count =0;
        if(root.val>=max){
            max=root.val;
           count =1;
        }
        count+=helper(root.left,max);
        count+=helper(root.right,max);
        return count ;
    }

}