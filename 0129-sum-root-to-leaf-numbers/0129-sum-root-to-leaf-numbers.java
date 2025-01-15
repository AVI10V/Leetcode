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
    public int sumNumbers(TreeNode root) {
        int[] ans = new int[1];
        helper(root,ans,0);
        return ans[0];       
    }
    public void helper(TreeNode node, int[] ans ,int curr){
        curr=(curr*10)+node.val;
        if(node.right==null && node.left==null){
            ans[0]=ans[0]+curr;
            return;
        }

        if(node.left!=null)helper(node.left,ans,curr);
        if(node.right!=null)helper(node.right,ans,curr);



    }
}