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
    public int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNode> ans = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return 0;
        }
        ans.add(root);
        List<Integer> res = new ArrayList<>();
        res.add(0);
        list.add(res);

        while (!ans.isEmpty()) {
            int size = ans.size();
            List<Integer> result = new ArrayList<>();
            List<Integer> sublist = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode current = ans.peek();
                if (current.left != null) {
                    ans.add(current.left);
                    result.add(2 * res.get(i) + 1);
                }
                if (current.right != null) {
                    ans.add(current.right);
                    result.add(2 * res.get(i) + 2);
                }
                sublist.add(ans.poll().val);
            }
            list.add(result);
            res = result;
        }

        int maxWidth = 0;
        for (List<Integer> level : list) {
            if (!level.isEmpty()) {
                maxWidth = Math.max(maxWidth, level.get(level.size() - 1) - level.get(0) + 1);
            }
        }

        return maxWidth;
    }
}