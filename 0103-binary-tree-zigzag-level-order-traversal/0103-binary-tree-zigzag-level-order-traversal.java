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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> ans = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        boolean leftToRight = true;
        ans.add(root);
        while(!ans.isEmpty()){
            int size = ans.size();
            int count = 0;
            List<Integer> sublist = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode current = ans.poll();
                if (leftToRight) {
                    sublist.add(current.val);
                } else {
                    sublist.add(0, current.val); 
                }
                if (current.left != null) {
                    ans.add(current.left);
                }
                if (current.right != null) {
                    ans.add(current.right);
                }
            }
            list.add(sublist);
            leftToRight = !leftToRight;
        }
        return list;
    }
}