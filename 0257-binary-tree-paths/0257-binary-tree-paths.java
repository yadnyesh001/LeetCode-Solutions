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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root != null) {
            preorder(root, "", list);
        }
        return list;
    }

    public void preorder(TreeNode root, String path, List<String> list) {
        if (root == null) {
            return;
        }
        path += Integer.toString(root.val);
        
        if (root.left == null && root.right == null) {
            list.add(path);
        } else {
            path += "->";
            preorder(root.left, path, list);
            preorder(root.right, path, list);
        }
    }
}
