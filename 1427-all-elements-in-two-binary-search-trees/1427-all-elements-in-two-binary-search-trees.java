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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();
        dfs(root1,ans);
        dfs(root2,ans2);
        List<Integer> main = new ArrayList<>();
        int s1=0;
        int s2=0;
        while(s1<ans.size() && s2<ans2.size()){
            if(ans.get(s1)<ans2.get(s2)){
                main.add(ans.get(s1));
                s1++;
            }
            else{
                main.add(ans2.get(s2));
                s2++;
            }
        }
        while(s1<ans.size()){
            main.add(ans.get(s1));
            s1++;
        }
         while(s2<ans2.size()){
            main.add(ans2.get(s2));
            s2++;
        }
        return main ;

    }
    public void dfs(TreeNode root, List<Integer> ans){
        if(root==null)return;
        dfs(root.left,ans);
        ans.add(root.val);
        dfs(root.right,ans);
    }
}