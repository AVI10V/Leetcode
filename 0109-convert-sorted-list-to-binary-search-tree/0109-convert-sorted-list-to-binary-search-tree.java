/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)return null;
        List<Integer> ans = new ArrayList<Integer>();
        while(head!=null){
            ans.add(head.val);
            head=head.next;
        }
        return helper(ans,0,ans.size()-1);
        
    }
    public TreeNode helper(List<Integer> ans , int s, int e){
        if(s>e)return null;
        int m=(s+e)/2;
        TreeNode root=new TreeNode(ans.get(m));
        root.left=helper(ans,s,m-1);
        root.right=helper(ans,m+1,e);
        return root;
    }
}