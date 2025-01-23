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
    public int maxLevelSum(TreeNode root) {
        if(root==null)return 0;
        Queue<TreeNode> qu=new LinkedList<TreeNode>();
        int max =Integer.MIN_VALUE;
        int level=0;
        int ans =0;
        qu.offer(root);
        while(!qu.isEmpty()){
            level++;
            int sum=0;
            int n=qu.size();
            for(int i=0;i<n;i++){
                TreeNode nn=qu.poll();
                sum+=nn.val;
                if(nn.left!=null)qu.offer(nn.left);
                if(nn.right!=null)qu.offer(nn.right);
                
            }
            if(sum==max)continue;
            else{
                if(sum>max){
                    max=sum;
                    ans=level; 
                }
                else continue;

            }

        }
        return ans;
        
    }
}