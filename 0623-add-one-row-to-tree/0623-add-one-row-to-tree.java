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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode nn= new TreeNode(val);
            nn.left=root;
            return nn;

        }
       
        helper(root,val,1,depth);
        return root;
        
    }
    public void helper(TreeNode node, int val, int curr, int depth){
        if(node==null)return;

        if(curr==depth-1){
            TreeNode tleft=node.left;
            TreeNode tright=node.right;
            node.left=new TreeNode(val);
            node.right=new TreeNode(val);
            node.left.left=tleft;
            node.right.right=tright;
            
        }
        else{
            helper(node.left,val,curr+1,depth);
            helper(node.right,val,curr+1,depth);
        }
    }
}