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

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int max=Integer.MIN_VALUE;
        int ind=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
           if(nums[i]>max){
            max=nums[i];
            ind=i;
           }
        }
        TreeNode root= new TreeNode(max);
        root.left=build(0, ind-1, nums);
        root.right=build(ind+1 , n-1 , nums);
        return root;

    }
    public TreeNode build(int s , int e , int[] nums){
        if(s>e)return null;
        int max =Integer.MIN_VALUE;
        int ind=0;
        for(int i=s;i<=e;i++){
            if(nums[i]>max){
                max=nums[i];
                ind=i;
            }
        }
        TreeNode root= new TreeNode(max);
        root.left=build(s , ind-1 ,nums);
        root.right=build(ind+1 , e , nums);
        return root;
    }
}