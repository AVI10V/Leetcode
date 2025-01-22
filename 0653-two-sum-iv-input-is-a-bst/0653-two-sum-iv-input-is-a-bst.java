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
 public class BSIT{
    private Stack<TreeNode> st= new Stack<TreeNode>();
    private boolean isreverse=true;
    public BSIT(TreeNode root, boolean rev){
         isreverse=rev;
         // isreverse ==true meaning back()
         //is reverse==false meaning the next() increasing order
         pushall(root);
    }
    public boolean hasnext(){
        return !st.isEmpty();
    }
    public int next(){
        TreeNode temp=st.pop();
        if(isreverse==false){
            pushall(temp.right);
        }
        else{
            pushall(temp.left);
        }
        return temp.val;
    }
    public void pushall(TreeNode node){
        while(node!=null){
            st.push(node);
            if(isreverse==true){
                node=node.right;
            }
            else{
                node=node.left;
            }
        }
    }

 }





class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if(root==null)return false;
        BSIT l=new BSIT(root,false);
        BSIT r=new BSIT(root,true);  //ascending order
        int i=l.next();
        int j=r.next();
        while(i<j){
            if(i+j==k)return true;
            else if((i+j)>k){
                j=r.next();
            }
            else{
                i=l.next();
            }
        }
        return false;
        
    }
}