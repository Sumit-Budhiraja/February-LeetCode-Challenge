class Solution {
    private int[] group;
    public boolean isBipartite(int[][] graph) {
        group = new int[graph.length];
        for(int i = 0; i < graph.length; i++) {
            if(group[i] == 0 && !dfs(graph, i, 1)) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean dfs(int[][] graph, int node, int expectedGroup) {
        // one of two
        expectedGroup = expectedGroup == 1 ? 2 : 1;
        
        for(int child : graph[node]) {
            if(group[child] > 0 && group[child] != expectedGroup) {
                return false;
            }
            
            if(group[child] > 0) {
                continue;
            }
            
            group[child] = expectedGroup;
            if(!dfs(graph, child, expectedGroup)) {
                return false;
            }
        }
        
        return true;
    }
}