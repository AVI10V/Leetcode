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
    public void inorder(List<Integer> ans,TreeNode root){
        if(root==null)return;
        ans.add(root.val);
        inorder(ans,root.left);
        inorder(ans,root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        if(root==null)return root;
        List<Integer> ans = new ArrayList<>();
        inorder(ans,root);
        Collections.sort(ans);
        int n=ans.size();
        TreeNode base=new TreeNode(ans.get(0));
        TreeNode main =base;
        for(int i=1;i<n;i++){
            TreeNode nn= new TreeNode(ans.get(i));
            base.right=nn;
            base=nn;

        }
        return main ;

        
    }
}