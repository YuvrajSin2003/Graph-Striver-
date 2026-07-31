import java.util.*;

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
        //*********************** BFS Approach ***************************** 

        public boolean cycleBFS(int src , boolean[] visited , List<List<Integer>> adj){
            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[]{src , -1});
            visited[src] = true;
            while(!queue.isEmpty()){
                int[] curr = queue.poll();
                int node = curr[0] , parent = curr[1];
                for(int neigh :adj.get(node)){
                    if(!visited[node]){
                        visited[neigh] = true;
                        queue.add(new int[]{neigh , node});
                    }else if(neigh != parent){
                        return true;
                    }
                }
            }
            return false;
        }

}
