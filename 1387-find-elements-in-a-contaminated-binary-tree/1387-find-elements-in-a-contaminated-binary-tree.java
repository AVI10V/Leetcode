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
class FindElements {
    Set<Integer> st = new HashSet<>();

    public void dfs(TreeNode root,int parent){
        if(root==null)return;
        if(root.left!=null){
            root.left.val=2*parent+1;
            st.add(root.left.val);
            dfs(root.left,root.left.val);
        }
        if(root.right!=null){
            root.right.val=2*parent+2;
            st.add(root.right.val);
            dfs(root.right,root.right.val);
            
        }
        return;
    }
    public FindElements(TreeNode root) {
       int parent =0;
       TreeNode newroot=root;
       root.val=parent;
       st.add(0);
       dfs(root,parent);
       root=newroot;
       
    }
    
    public boolean find(int target) {
        if(st.contains(target))return true;
        return false;
        
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */