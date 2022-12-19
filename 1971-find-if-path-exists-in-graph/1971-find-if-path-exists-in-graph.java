public class Solution {
    boolean f;

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        f = false;

        if (source == destination) return true;

        Map<Integer, List<Integer>> graph = new HashMap<>();
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) graph.put(i, new ArrayList<>());

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        dfs(graph, visited, source, destination);

        return f;
    }

    private void dfs(Map<Integer, List<Integer>> graph, boolean[] visited, int source, int destination) {
        if (visited[source] || f) return;

        visited[source] = true;

        for (int i : graph.get(source)) {
            if (i == destination) {
                f = true;
                break;
            }

            if (!visited[i])
                dfs(graph, visited, i, destination);
        }
    }
}