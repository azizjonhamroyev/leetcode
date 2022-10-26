package Pseudo_Palindromic_Paths_in_a_Binary_Tree;

import java.util.HashMap;

public class Solution {
    int res = 0;

    public int pseudoPalindromicPaths(TreeNode root) {
        dfs(root, new HashMap<>());
        return res;
    }

    private void dfs(TreeNode root, HashMap<Integer, Integer> freq) {
        if (root == null) return;
        freq.put(root.val, freq.getOrDefault(root.val, 0) + 1);
        if (root.left == null && root.right == null) {
            int odds = 0;
            for (Integer value : freq.values()) {
                if (value % 2 == 1 && ++odds > 1) return;
            }
            res++;
            return;
        }
        dfs(root.left, new HashMap<>(freq));
        dfs(root.right, new HashMap<>(freq));
    }
}
