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
    public boolean isCompleteTree(TreeNode root) {
        if(root==null)return true;
        Queue<TreeNode> qu= new LinkedList<TreeNode>();
        boolean ans =true;
        qu.offer(root);
        while(!qu.isEmpty()){
            int n=qu.size();
            for(int i=0;i<n;i++){
                TreeNode curr=qu.poll();
                if(curr==null){
                    while(!qu.isEmpty()){
                        if(qu.poll()!=null){
                            ans=false;
                            break;
                        }
                    }
                }
                else{
                    qu.offer(curr.left);
                    qu.offer(curr.right);
                    }
                
            }
        }
        return ans;
        
    }
}