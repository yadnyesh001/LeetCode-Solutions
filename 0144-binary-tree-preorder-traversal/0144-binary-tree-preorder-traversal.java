class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preorderHelper(root, ans);
        return ans;
    }
    
    private void preorderHelper(TreeNode node, List<Integer> ans) {
        if (node == null) {
            return;
        }
        ans.add(node.val);
        preorderHelper(node.left, ans);
        preorderHelper(node.right, ans);
    }
}