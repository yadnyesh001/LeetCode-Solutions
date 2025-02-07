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
        if(root == null){
            return 0;
        }
        queue.add(root);
        int max = Integer.MIN_VALUE;
        int index = 0;
        int res = 0;
        while(!queue.isEmpty()){
            int x = queue.size();
            int sum = 0;
            for(int i=0; i<x; i++){
                if(queue.peek().left != null){
                    queue.add(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.add(queue.peek().right);
                }
                sum = sum + queue.poll().val; 
            }
            index++;
            if(max < sum){
                max = sum;
                res = index;
            }
        }
        return res;
    }
}