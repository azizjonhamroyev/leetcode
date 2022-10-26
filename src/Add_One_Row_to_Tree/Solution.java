package Add_One_Row_to_Tree;

public class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }
        dfs(root, 1, val, depth);
        return root;
    }

    private void dfs(TreeNode root, int curr, int val, int depth) {
        if (root == null) return;
        if (depth == curr + 1) {
            TreeNode left = new TreeNode(val);
            TreeNode right = new TreeNode(val);
            left.left = root.left;
            right.right = root.right;
            root.left = left;
            root.right = right;
            return;
        }
        dfs(root.left, curr + 1, val, depth);
        dfs(root.right, curr + 1, val, depth);
    }
}
