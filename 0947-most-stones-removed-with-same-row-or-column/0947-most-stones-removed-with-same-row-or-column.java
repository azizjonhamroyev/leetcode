class Solution {
    int res = 0;
    int curr = 0;
    HashMap<Integer, ArrayList<Integer>> row = new HashMap<>();
    HashMap<Integer, ArrayList<Integer>> column = new HashMap<>();

    public int removeStones(int[][] stones) {


        for (int[] stone : stones) {
            if (!row.containsKey(stone[0])) {
                row.put(stone[0], new ArrayList<>());
                row.get(stone[0]).add(stone[1]);
            } else row.get(stone[0]).add(stone[1]);
            if (!column.containsKey(stone[1])) {
                column.put(stone[1], new ArrayList<>());
                column.get(stone[1]).add(stone[0]);
            } else column.get(stone[1]).add(stone[0]);
        }

        boolean[] visited = new boolean[10001];


        for (int i : row.keySet()) {
            dfs(i, visited);
            res += curr != 0 ? curr - 1 : 0;
            curr = 0;
        }
        return res;
    }


    private void dfs(int i, boolean[] visited) {
        ArrayList<Integer> list = row.get(i);
        if (!visited[i]) {
            visited[i] = true;
            curr += list.size();
            for (int j : list) {
                ArrayList<Integer> list1 = column.getOrDefault(j, new ArrayList<>());
                for (int k : list1) if (!visited[k]) dfs(k, visited);
            }
        }
    }
}