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
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> ans = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<TreeNode>();
        qu.offer(root);
        while(!qu.isEmpty()){
            int n=qu.size();
            long levels=0L;
            for(int i=0;i<n;i++){
                TreeNode nn= qu.poll();
                levels+=(long)nn.val;
                if(nn.left!=null)qu.offer(nn.left);
                if(nn.right!=null)qu.offer(nn.right);
            }
            ans.add(levels);

        }
        Collections.sort(ans);
        if(k<=ans.size()){
            return ans.get(ans.size()-k);
        }
        return -1;
        
    }
}