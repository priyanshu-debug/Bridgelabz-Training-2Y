import java.util.*;

public class SocialNetwork {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> graph = new HashMap<>();

        addEdge(graph, "Alice", "Bob");
        addEdge(graph, "Alice", "Charlie");
        addEdge(graph, "Bob", "David");
        addEdge(graph, "Charlie", "Eve");
        addEdge(graph, "David", "Eve");

        System.out.println("Friends of Alice: " + graph.get("Alice"));
        System.out.println("Bob and Eve connected? " + graph.get("Bob").contains("Eve"));

        shortestPath(graph, "Alice", "Eve");
    }

    static void addEdge(HashMap<String, ArrayList<String>> graph, String a, String b) {
        graph.putIfAbsent(a, new ArrayList<>());
        graph.putIfAbsent(b, new ArrayList<>());

        graph.get(a).add(b);
        graph.get(b).add(a);
    }

    static void shortestPath(HashMap<String, ArrayList<String>> graph, String start, String end) {
        Queue<String> q = new LinkedList<>();
        HashMap<String, String> parent = new HashMap<>();
        HashSet<String> visited = new HashSet<>();

        q.add(start);
        visited.add(start);

        while (!q.isEmpty()) {
            String node = q.poll();

            if (node.equals(end)) break;

            for (String nbr : graph.get(node)) {
                if (!visited.contains(nbr)) {
                    visited.add(nbr);
                    parent.put(nbr, node);
                    q.add(nbr);
                }
            }
        }

        ArrayList<String> path = new ArrayList<>();
        String cur = end;

        while (cur != null) {
            path.add(cur);
            cur = parent.get(cur);
        }

        Collections.reverse(path);
        System.out.println("Shortest path: " + path);
        System.out.println("Degree of separation: " + (path.size() - 1));
    }
}