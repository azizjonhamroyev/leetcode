class Solution {

    int[] colors;

    public boolean possibleBipartition(int n, int[][] dislikes) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());
        colors = new int[n + 1];

        for (int[] dislike : dislikes) {
            graph.get(dislike[0]).add(dislike[1]);
            graph.get(dislike[1]).add(dislike[0]);
        }


        for (int i = 1; i <= n; i++)
            if (colors[i] == 0 && !dfs(i, graph, 1))
                return false;

        return true;
    }

    private boolean dfs(int i, ArrayList<ArrayList<Integer>> graph, int color) {
        colors[i] = color;

        for (int node : graph.get(i)) {
            if (colors[node] == color || colors[node] == 0 && !dfs(node, graph, -color))
                return false;

        }

        return true;
    }

}