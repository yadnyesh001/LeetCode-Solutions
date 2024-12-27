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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> ans = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        ans.offer(root);
        while(!ans.isEmpty()){
            int size = ans.size();
            List<Integer> sublist = new ArrayList<>();
            for(int i=0; i<size; i++){
                if(ans.peek().left != null){
                    ans.offer(ans.peek().left);
                }
                if(ans.peek().right != null){
                    ans.offer(ans.peek().right);
                }
                sublist.add(ans.poll().val);
            }
            list.add(sublist);
        }
        return list;
    }
}