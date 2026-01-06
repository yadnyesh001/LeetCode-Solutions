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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int max = 0;
        int x = 0;
        int level = 0;
        while(!queue.isEmpty()){
            x++;
            int sum = 0;
            int size = queue.size();
            for(int i=0; i<size; i++){
                if(queue.peek().left != null){
                    queue.add(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.add(queue.peek().right);
                }
                sum = sum + queue.poll().val;
            }
            if(sum > max){
                level = x;
                max = sum;
            }
        }
        return level;
    }
}