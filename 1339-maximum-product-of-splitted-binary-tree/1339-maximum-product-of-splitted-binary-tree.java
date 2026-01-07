class Solution {
    long totalSum = 0;
    long maxProduct = 0;
    int MOD = 1_000_000_007;

    public int maxProduct(TreeNode root) {
        totalSum = treeSum(root);
        subtreeSum(root);
        return (int)(maxProduct % MOD);
    }

    private long subtreeSum(TreeNode root) {
        if (root == null){
            return 0;
        }
        long left = subtreeSum(root.left);
        long right = subtreeSum(root.right);
        long currSum = left + right + root.val;
        long product = currSum * (totalSum - currSum);
        maxProduct = Math.max(maxProduct, product);
        return currSum;
    }

    private long treeSum(TreeNode root) {
        if (root == null){
            return 0;
        }
        return root.val + treeSum(root.left) + treeSum(root.right);
    }
}
