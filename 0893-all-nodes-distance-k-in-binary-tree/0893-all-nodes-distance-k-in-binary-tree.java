/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void mark(TreeNode root,Map<TreeNode,TreeNode> parent){
        Queue<TreeNode> qu=new LinkedList<TreeNode>();
        qu.offer(root);
        while(!qu.isEmpty()){
            int n=qu.size();
            for(int i=0;i<n;i++){
                TreeNode nn=qu.poll();
                if(nn.left!=null){
                    qu.offer(nn.left);
                    parent.put(nn.left,nn);
                }
                if(nn.right!=null){
                    qu.offer(nn.right);
                    parent.put(nn.right,nn);
                }
            }
           



        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> parent= new HashMap<>();
        mark(root,parent);
        Queue<TreeNode> qu=new LinkedList<TreeNode>();
        Map<TreeNode,Boolean> vis=new HashMap<>();
        qu.offer(target);
        vis.put(target,true);
        int dis=0;
        while(!qu.isEmpty()){
            int n=qu.size();
            if(dis==k)break;
            dis++;
            for(int i=0;i<n;i++){
                TreeNode nn=qu.poll();
                if(nn.left!=null && vis.get(nn.left)==null){
                    qu.offer(nn.left);
                    vis.put(nn.left,true);
                }
                if(nn.right!=null && vis.get(nn.right)==null){
                    qu.offer(nn.right);
                    vis.put(nn.right,true);
                }
                if(parent.get(nn)!= null && vis.get(parent.get(nn))==null){
                    qu.offer(parent.get(nn));
                    vis.put(parent.get(nn),true);
                }
            }
            
        }
        List<Integer> ans = new ArrayList<>();
        while(!qu.isEmpty()){
            ans.add(qu.poll().val);
        }
        return ans;
        
        
    }
}