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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int n= preorder.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(postorder[i],i);
        }
        return build(0,n-1,0,n-1,preorder, postorder,map);
         
    }
    public TreeNode build(int i1, int i2 ,int j1, int j2, int[] preorder, int[] postorder,Map<Integer,Integer> map){
        if(i1>i2 || j1>j2)return null;
        TreeNode root = new TreeNode(preorder[i1]);
        if(i1!=i2){
            int left=preorder[i1+1];
            int mid=map.get(left);
            int left_size=mid-j1+1;
            root.left=build(i1+1, i1+left_size , j1,mid,preorder, postorder,map);
            root.right=build(i1+left_size+1,i2,mid+1,j2-1,preorder,postorder,map);
        }

        return root;

    }
}