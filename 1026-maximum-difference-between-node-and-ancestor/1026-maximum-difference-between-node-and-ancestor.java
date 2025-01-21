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
    private int ans = 0;
    public int maxAncestorDiff(TreeNode root) {
        if(root == null){
            return 0;
        }
        preorder(root, root.val, root.val);
        return ans;
    }

    public void preorder(TreeNode root, int min, int max){
        if(root == null){
            return;
        }
        min = Math.min(min, root.val);
        max = Math.max(max, root.val);
        ans = Math.max(max - min, ans);
        preorder(root.left, min, max);
        preorder(root.right, min, max);
    }
}