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
    private String serialize(TreeNode root, String str) {
        if(root == null) {
            str += "null,";
        } else {
            str += str.valueOf(root.val) + ",";
            str = serialize(root.left, str);
            str = serialize(root.right, str);
        }
        return str;
    }
    
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return serialize(root, "");
    }

    private TreeNode deserialize(List<String> list) {
        if(list.get(0).equals("null")) {
            list.remove(0);
            return null;
        }
        
        TreeNode root = new TreeNode(Integer.valueOf(list.get(0)));
        list.remove(0);
        root.left = deserialize(list);
        root.right = deserialize(list);
        
        return root;
    }
    
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] data_array = data.split(",");
        List<String> data_list = new ArrayList<>(Arrays.asList(data_array));
        return deserialize(data_list);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));