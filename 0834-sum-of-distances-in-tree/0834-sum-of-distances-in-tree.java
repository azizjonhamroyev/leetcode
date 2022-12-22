class Solution {
    
    int n;
    int[] count, answer;
    List<Integer>[] graph;
    
    private void postorder (int node, int parent) {
        
        for (int child : graph[node]) {
            if (child != parent) {
                postorder (child, node);
                count[node] += count[child];
                answer[node] += answer[child] + count[child];
            }
        }
    }
    
    private void preorder (int node, int parent) {
        
        for (int child : graph[node]) {
            if (child != parent) {
                answer[child] = answer[node] - count[child] + n - count[child];
                preorder (child, node);
            }
        }
    }
    
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        
        this.n = n;
        count = new int[n];
        answer = new int[n];
        graph = new List[n];
        
        Arrays.fill (count, 1);
        
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<> ();
        }
        
        for (int[] edge : edges) {
            graph[edge[0]].add (edge[1]);
            graph[edge[1]].add (edge[0]);
        }
        
        postorder (0, -1);
        preorder (0, -1);
        
        return answer;
    }
}