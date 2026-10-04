   for (int i = 0; i < n; i++) {
            if (isConnected[i][i] == 1) {
                provinces++;
                dfs(i, isConnected);
            }
        }

        return provinces;
    }

    public void dfs(int city, int[][] graph) {
        graph[city][city] = 0;

        for (int i = 0; i < graph.length; i++) {
            if (graph[city][i] == 1) {
                graph[city][i] = 0;
                graph[i][city] = 0;
                dfs(i, graph);
            }
        }
    }
}