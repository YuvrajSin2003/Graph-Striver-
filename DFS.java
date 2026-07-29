import java.util.List;
import java.util.Map;

public class DFS {
    public void DFS(int node, Map<Integer, List<Integer>> adj, boolean[] visited, List<Integer> result){
        visited[node] = true;
        result.add(node);
        for(int neigh :adj.getOrDefault(node, new ArrayList<>())){
            if(!visited[neigh]){
                DFS(neigh , adj visited , result);
            }
        }
    }
}
