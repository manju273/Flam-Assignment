import java.util.*;

public class CircularDependencyChecker {
    public boolean hasCircularDependency(int n, List<List<Integer>> edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (List<Integer> edge : edges) graph.get(edge.get(0)).add(edge.get(1));

        boolean[] visited = new boolean[n];
        boolean[] recStack = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (dfs(i, graph, visited, recStack)) return true;
        }
        return false;
    }

    private boolean dfs(int node, List<List<Integer>> graph, boolean[] visited, boolean[] recStack) {
        if (recStack[node]) return true;
        if (visited[node]) return false;

        visited[node] = recStack[node] = true;
        for (int neighbor : graph.get(node)) {
            if (dfs(neighbor, graph, visited, recStack)) return true;
        }
        recStack[node] = false;
        return false;
    }

    public static void main(String[] args) {
        CircularDependencyChecker checker = new CircularDependencyChecker();
        List<List<Integer>> edges = Arrays.asList(
            Arrays.asList(0, 1),
            Arrays.asList(1, 2),
            Arrays.asList(2, 0)
        );
        System.out.println(checker.hasCircularDependency(4, edges));  
    }
}
