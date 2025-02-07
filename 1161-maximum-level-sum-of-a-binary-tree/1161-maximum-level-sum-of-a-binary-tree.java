/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        int max = Integer.MIN_VALUE;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int curlevel = 1;
        int maxLevel = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            int curSum = 0;
            for (int i = 1; i <= size; i++) {
                TreeNode n = q.poll();
                if (n != null){
                    curSum += n.val;
                }
                if (n.left != null){
                    q.offer(n.left);
                }
                if (n.right != null){
                    q.offer(n.right);
                }
            }
            if (max < curSum) {
                maxLevel = curlevel;
                max = curSum;
            }
            curlevel++;
        }
        return maxLevel;
    }
}