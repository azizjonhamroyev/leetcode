class Solution {

    public boolean[] visited;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();

        visited = new boolean[n];

        visited[0] = true;
        dfs(rooms, 0);

        for (boolean b : visited)
            if (!b) return false;

        return true;
    }

    private void dfs(List<List<Integer>> rooms, int i) {
        for (int key : rooms.get(i)) {
            if (!visited[key]) {
                visited[key] = true;
                dfs(rooms, key);
            }
        }
    }
}