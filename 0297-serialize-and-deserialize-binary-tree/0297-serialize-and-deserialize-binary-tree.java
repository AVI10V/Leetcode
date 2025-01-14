/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 //COPIED FROM GPT TO BE SOLVED AGAIN !! CONCEPT IS LEARNED
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "";
        Queue<TreeNode> qu = new LinkedList<>();
        StringBuilder ans = new StringBuilder();
        qu.offer(root);
        
        while (!qu.isEmpty()) {
            TreeNode r = qu.poll();
            if (r == null) {
                ans.append("#,"); // Represent null nodes as '#'
            } else {
                ans.append(r.val).append(","); // Append the value and a delimiter
                qu.offer(r.left);  // Add left child (nulls included)
                qu.offer(r.right); // Add right child (nulls included)
            }
        }
        
        return ans.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.isEmpty()) return null;

        // Split the serialized string by comma
        String[] nodes = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int i = 1; // Index for traversing the nodes array
        while (!q.isEmpty() && i < nodes.length) {
            TreeNode curr = q.poll();
            
            // Process left child
            if (!nodes[i].equals("#")) {
                TreeNode leftNode = new TreeNode(Integer.parseInt(nodes[i]));
                curr.left = leftNode;
                q.offer(leftNode);
            }
            i++;

            // Process right child
            if (i < nodes.length && !nodes[i].equals("#")) {
                TreeNode rightNode = new TreeNode(Integer.parseInt(nodes[i]));
                curr.right = rightNode;
                q.offer(rightNode);
            }
            i++;
        }
        
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));