import java.util.*;

public class NetworkRouting {
    static HashMap<String, ArrayList<String>> graph = new HashMap<>();

    public static void main(String[] args) {
        addEdge("R1", "R2");
        addEdge("R1", "R3");
        addEdge("R2", "R4");
        addEdge("R3", "R4");
        addEdge("R4", "R5");
        addEdge("R5", "R6");

        System.out.println("Network connected? " + isConnected());

        System.out.println("Minimum hops R1 to R6:");
        bfsShortestPath("R1", "R6");

        removeEdge("R4", "R5");

        System.out.println("After R4-R5 failure:");
        bfsShortestPath("R1", "R6");
    }

    static void addEdge(String a, String b) {
        graph.putIfAbsent(a, new ArrayList<>());
        graph.putIfAbsent(b, new ArrayList<>());

        graph.get(a).add(b);
        graph.get(b).add(a);
    }

    static void removeEdge(String a, String b) {
        graph.get(a).remove(b);
        graph.get(b).remove(a);
    }

    static boolean isConnected() {
        HashSet<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();

        String start = graph.keySet().iterator().next();
        q.add(start);
        visited.add(start);

        while (!q.isEmpty()) {
            String node = q.poll();

            for (String nbr : graph.get(node)) {
                if (!visited.contains(nbr)) {
                    visited.add(nbr);
                    q.add(nbr);
                }
            }
        }

        return visited.size() == graph.size();
    }

    static void bfsShortestPath(String start, String end) {
        Queue<String> q = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();
        HashMap<String, String> parent = new HashMap<>();

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

        if (!visited.contains(end)) {
            System.out.println("No path found");
            return;
        }

        ArrayList<String> path = new ArrayList<>();
        String cur = end;

        while (cur != null) {
            path.add(cur);
            cur = parent.get(cur);
        }

        Collections.reverse(path);

        System.out.println("Path: " + path);
        System.out.println("Hops: " + (path.size() - 1));
    }
}