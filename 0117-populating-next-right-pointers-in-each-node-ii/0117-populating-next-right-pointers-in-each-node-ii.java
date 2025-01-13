/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null)return root;
        Queue<Node> qu=new LinkedList<Node>();
        qu.offer(root);
        while(!qu.isEmpty()){
            Node prev=null;
            int n=qu.size();
            for(int i=0;i<n;i++){
                Node curr=qu.poll();
                if(prev!=null){
                    prev.next=curr;
                }
                prev=curr;
                if(curr.left!=null)qu.offer(curr.left);
                if(curr.right!=null)qu.offer(curr.right);
            }
           
        prev.next=null;

        }
        return root;
      
        
    }
    

}