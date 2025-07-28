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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null)return ans;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty()){
            int n=qu.size();
            for(int i=0;i<n;i++){
                TreeNode x=qu.poll();
                if(i==n-1){
                    ans.add(x.val);
                }
                if(x.left!=null){
                    qu.offer(x.left);
                }
                if(x.right!=null){
                    qu.offer(x.right);
                }
            }

        }
        return ans;
        
    }
}