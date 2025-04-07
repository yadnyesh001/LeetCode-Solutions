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
        ans.add(root);
        while(!ans.isEmpty()){
            List<Integer> sublist = new ArrayList<>();
            int size = ans.size();
            for(int i=0; i<size; i++){
                if(ans.peek().left != null){
                    ans.add(ans.peek().left);
                }
                if(ans.peek().right != null){
                    ans.add(ans.peek().right);
                }
                sublist.add(ans.poll().val);
            }
            list.add(sublist);
        }
        return list;
    }
}