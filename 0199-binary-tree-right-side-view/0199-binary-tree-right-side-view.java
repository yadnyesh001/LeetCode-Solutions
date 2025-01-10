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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> ans = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        ans.offer(root);
        while(!ans.isEmpty()){
            int size = ans.size();
            for(int i=0; i<size; i++){
                TreeNode currentNode = ans.poll();
                if (i == size - 1) {
                    list.add(currentNode.val);
                }
                if (currentNode.left != null) {
                    ans.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    ans.offer(currentNode.right);
                }
            }
        }
        return list;
    }
}