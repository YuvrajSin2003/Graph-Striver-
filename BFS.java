import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BFS {
    public list<String> BFS(int start, Map<Integer, List<Integer>> adj, int n){
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[n+1];

        queue.offer(start);
        visited[start] = true;

        while(!queue.isEmpty()){
            int node = queue.poll();
            result.add(node);
            for(int neigh :adj.getOrDefault(node, new ArrayList<>())){
                if(!visited[neigh]){
                    visited[neigh] = true;
                    queue.offer(neigh);
                }
            }
        }
        return result;
    }
}
