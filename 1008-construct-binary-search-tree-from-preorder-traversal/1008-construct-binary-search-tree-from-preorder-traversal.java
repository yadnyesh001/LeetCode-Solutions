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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        TreeNode ans = root;
        for(int i=1; i<preorder.length; i++){
            insertIntoBST(root, preorder[i]);
        }
        return ans;
    }

    public void insertIntoBST(TreeNode root, int val) {
        if (root == null) return;
        TreeNode ans = root;    
        while (true) {
            if (val < ans.val) { 
                if (ans.left == null) {
                    ans.left = new TreeNode(val);
                    break;
                } else {
                    ans = ans.left;
                }
            } else { 
                if (ans.right == null) { 
                    ans.right = new TreeNode(val);
                    break;
                } else {
                    ans = ans.right;
                }
            }
        }
    }
}