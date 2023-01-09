import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer> ans = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root != null) {
            ans.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return ans;
    }
}