package path_sum_ii;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<List<Integer>> res = new ArrayList<>();
    int targetSum;

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        this.targetSum = targetSum;
        dfs(root, new ArrayList<>(), 0);
        return res;
    }

    private void dfs(TreeNode root, ArrayList<Integer> objects, int curr) {
        if (root == null) return;
        objects.add(root.val);
        curr += root.val;
        if (root.left == null && root.right == null && curr == targetSum) res.add(objects);
        dfs(root.left, new ArrayList<>(objects), curr);
        dfs(root.right, new ArrayList<>(objects), curr);
    }

}
