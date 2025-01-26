/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<TreeNode>();
        qu.offer(root);
        boolean odd = false;
        while(!qu.isEmpty()){
            int n=qu.size();
            TreeNode prev=null;
            for(int i=0;i<n;i++){
                TreeNode curr=qu.poll();
                if(!odd){
                    if(curr.val % 2!=1 || (prev!=null && curr.val<=prev.val))return false;
                }
                else{
                    if(curr.val %2 !=0 || 
                    (prev!=null && curr.val>=prev.val))return false;
                }
                prev=curr;
                if(curr.left!=null)qu.offer(curr.left);
                if(curr.right!=null)qu.offer(curr.right);
            }
            odd=(!odd);  

        }
        return true;
    

    }
}