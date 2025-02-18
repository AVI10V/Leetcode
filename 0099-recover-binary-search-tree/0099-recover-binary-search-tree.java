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
    public void recoverTree(TreeNode root) {
       TreeNode prev=null;
       TreeNode first=null;
       TreeNode second =null;
       while(root!=null){
        if(root.left==null){
            if(prev!=null && prev.val>root.val){
                if(first==null)first=prev;
                second=root;
            }
            prev=root;
            root=root.right;
            
        }
        else{
            TreeNode temp=root.left;
            while(temp.right!=null &&  temp.right!=root){
                temp=temp.right;
            }
            if(temp.right==null){
                temp.right=root;
                root=root.left;
            }
            else{
                temp.right=null;
                if(prev!=null && prev.val>root.val){
                    if(first==null)first=prev;
                    second=root;
                }
                prev=root;
                root=root.right;
            }
        }
       }
         if(first!=null && second!=null){
            int tempValue = first.val;
            first.val = second.val;
            second.val = tempValue;

        
      
       }
        
    }
}