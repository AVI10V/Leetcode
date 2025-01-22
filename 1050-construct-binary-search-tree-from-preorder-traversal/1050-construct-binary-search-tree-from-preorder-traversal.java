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
    public TreeNode bstFromPreorder(int[] preorder) {
        Stack<TreeNode> st=new Stack<TreeNode>();
        TreeNode root=new TreeNode(preorder[0]);
        int main =root.val;
        TreeNode temp=root;
        for(int i=preorder.length-1;i>0;i--){
            st.push(new TreeNode(preorder[i]));
        }
        while(!st.isEmpty()){
            TreeNode curr=st.pop();
            TreeNode prev=null;
            while(temp!=null){
                if( temp!=null && temp.val>curr.val){
                    prev=temp;
                    temp=temp.left;
                }
                if(temp!=null && temp.val<curr.val){
                    prev=temp;
                    temp=temp.right;
                }
            }
            if(prev.val>curr.val){
                prev.left=curr;
            }
            else{
                prev.right=curr;
            }
            temp=root;

        }
        return root;
    }
}