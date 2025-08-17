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
    public String tree2str(TreeNode root) {
        if(root==null)return "";
       StringBuilder sb = new StringBuilder();
       func(sb , root);
       return sb.toString();
    }
    public void func(StringBuilder sb , TreeNode root){
        sb.append(root.val);
        if(root.left==null && root.right==null){
            return;
        } 
        if(root.left!=null){
            sb.append('(');
            func(sb ,root.left);
            sb.append(')');
        }
        else{
            sb.append("()");
        }
        if(root.right!=null){
            sb.append('(');
            func(sb , root.right);
            sb.append(')');

        }
        
        
    }

}