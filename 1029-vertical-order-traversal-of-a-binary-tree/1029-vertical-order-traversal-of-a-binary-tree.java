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
 class Tuple{
    TreeNode node ;
    int row;
    int col;
    public  Tuple(TreeNode n , int r, int c){
        this.node=n;
        this.row=r;
        this.col=c;
    }
 }




class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        Queue<Tuple> qu=new LinkedList<Tuple>();
        qu.offer(new Tuple(root,0,0));
        while(!qu.isEmpty()){
            Tuple t=qu.poll();
            TreeNode node=t.node;
            int x=t.row;
            int y=t.col;
            if(!map.containsKey(x)){
                map.put(x,new TreeMap<>());
            }
            if(!map.get(x).containsKey(y)){
                map.get(x).put(y,new PriorityQueue<Integer>());
            }
            map.get(x).get(y).offer(node.val);

            if(node.left!=null){
                qu.offer(new Tuple(node.left,x-1,y+1));
            }
            if(node.right!=null){
                qu.offer(new Tuple(node.right,x+1,y+1));
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> ys:map.values()){
            ans.add(new ArrayList<>());
            for(PriorityQueue<Integer> nodes:ys.values()){
                while(!nodes.isEmpty()){
                    ans.get(ans.size()-1).add(nodes.poll());
                }
            }
        }
        return ans;
        
    }
}
