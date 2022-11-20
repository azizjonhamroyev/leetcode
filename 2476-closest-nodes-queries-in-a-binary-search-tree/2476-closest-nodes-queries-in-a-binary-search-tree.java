class Solution {

    private ArrayList<Integer> list = new ArrayList<>();

    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        traverse(root);

        ArrayList<List<Integer>> res = new ArrayList<>();
        for (int query : queries) {
            res.add(binarySearch(list, query));
        }
        return res;
    }

    private void traverse(TreeNode root) {
        if (root == null) return;
        traverse(root.left);
        list.add(root.val);
        traverse(root.right);
    }

    private List<Integer> binarySearch(List<Integer> list, int num) {
        int start = 0, end = list.size() - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (list.get(mid) == num) return List.of(num, num);
            else if (list.get(mid) > num) {
                end = mid - 1;
            } else start = mid + 1;
        }
        return List.of(end == -1 ? end : list.get(end), start == list.size() ? -1 : list.get(start));
    }
}