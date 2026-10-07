/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Codec {

    private static final String DELIMITER = ",";
    private static final String NULL_MARKER = "#";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeDFS(root, sb);
        return sb.toString();
    }

    private void serializeDFS(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append(NULL_MARKER).append(DELIMITER);
            return;
        }

        // Pre-order: Root -> Left -> Right
        sb.append(node.val).append(DELIMITER);
        serializeDFS(node.left, sb);
        serializeDFS(node.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.isEmpty()) return null;
        
        String[] nodesArray = data.split(DELIMITER);
        Queue<String> queue = new LinkedList<>(Arrays.asList(nodesArray));
        return deserializeDFS(queue);
    }

    private TreeNode deserializeDFS(Queue<String> queue) {
        if (queue.isEmpty()) return null;

        String current = queue.poll();

        if (current.equals(NULL_MARKER)) {
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(current));
        node.left = deserializeDFS(queue);
        node.right = deserializeDFS(queue);

        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));