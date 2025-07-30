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
    Map<TreeNode , Integer> map =new HashMap<>();
    public int rob(TreeNode root) {
        if(root==null)return 0;
        if(map.containsKey(root))return map.get(root);
        int take=root.val;
        if(root.left!=null){
            take+=rob(root.left.left);
            take+=rob(root.left.right);
        }
        if(root.right!=null){
            take+=rob(root.right.left);
            take+=rob(root.right.right);
        }
        int nottake=rob(root.left)+rob(root.right);
        map.put(root , Math.max(take , nottake));
        return Math.max(take , nottake);


    }
}