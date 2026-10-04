class Solution {
    public boolean isBipartite(int[][] graph) {
        
        int n = graph.length;
        int color[] = new int[n];

        for(int i=0;i<n;i++)
        {
            if (color[i] == 0) {
                color[i] = 1;

                if (!dfs(graph,i,color)) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean dfs(int[][] graph,int node,int [] color)
    {
        for(int neighbour:graph[node])
        {
            if(color[neighbour]==0){
                color[neighbour] = 3-color[node];


                if(!dfs(graph,neighbour,color)) return false;
            }
            else if(color[node]==color[neighbour]) return false;

        }
        return true;
    }
}