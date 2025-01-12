public class Solution {
    public Node connect(Node root) {
        if (root == null) return null;
        Queue<Node> ans = new LinkedList<>();
        ans.add(root);
        while (!ans.isEmpty()) {
            int size = ans.size();
            for (int i = 0; i < size; i++) {
                Node current = ans.poll();
                if (i < size - 1) {
                    current.next = ans.peek();
                }
                if (current.left != null) ans.add(current.left);
                if (current.right != null) ans.add(current.right);
            }
        }
        return root;
    }
}