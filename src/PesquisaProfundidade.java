import java.util.*;

public class PesquisaProfundidade {
    private static void dfsUtil(Map<Character, List<Character>> graph, char vertex, Set<Character> visited) {
        visited.add(vertex);
        System.out.print(vertex + " ");

        List<Character> neighbors = graph.get(vertex);
        if (neighbors != null) {
            for(char neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    dfsUtil(graph, neighbor, visited);
                }
            }
        }
    }

    public static void dfs(Map<Character, List<Character>> graph, char startVertex) {
        Set<Character> visited = new HashSet<>();
        dfsUtil(graph, startVertex, visited);
    }

    public static void main(String[] args) {
        Map<Character, List<Character>> graph = new HashMap<>();
        graph.put('A', Arrays.asList('B', 'C'));
        graph.put('B', Arrays.asList('A', 'D'));
        graph.put('C', Arrays.asList('A', 'E', 'F'));
        graph.put('D', Arrays.asList('B'));
        graph.put('E', Arrays.asList('C'));
        graph.put('F', Arrays.asList('C'));

        System.out.println("Starting from A:..");
        dfs(graph, 'A');
    }
}
