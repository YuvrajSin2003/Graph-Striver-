public class CycleUndirected {

    //*********************** DFS Approach ***************************** 

    public boolean isCycle(int node , int parent , boolean[] visited ,List<List<Integer>> adj ){
        visited[node] = true;
        for(int neigh : adj.get(node)){
            if(!visited[neigh]){
                if(isCycle(neigh, parent, visited, adj)){
                    return true;
                }else if(neigh != parent){
                    return true;
                }
            }
            return false;
        }
    }
    public boolean hasCycle(int V , List<List<Integer>> adj){

        boolean visited[] = new boolean[V];
        for(int i = 0 ; i<V ; i++){
            if(!visited[i]){
                if(isCycle(i , -1 , visited , adj));
            }
        }
    }
}
