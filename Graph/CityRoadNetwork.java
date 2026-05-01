import java.util.*;

class Road {
    String to;
    int distance;

    Road(String to, int distance) {
        this.to = to;
        this.distance = distance;
    }
}

public class CityRoadNetwork {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Road>> graph = new HashMap<>();

        addOneWay(graph, "A", "B", 5);
        addTwoWay(graph, "B", "C", 3);
        addTwoWay(graph, "A", "D", 7);
        addOneWay(graph, "D", "E", 2);
        addOneWay(graph, "C", "E", 4);

        System.out.println("Reachable from A:");
        bfsReachable(graph, "A");

        System.out.println("\nFewest turns path A to E:");
        bfsPath(graph, "A", "E");
    }

    static void addOneWay(HashMap<String, ArrayList<Road>> graph, String a, String b, int d) {
        graph.putIfAbsent(a, new ArrayList<>());
        graph.putIfAbsent(b, new ArrayList<>());
        graph.get(a).add(new Road(b, d));
    }

    static void addTwoWay(HashMap<String, ArrayList<Road>> graph, String a, String b, int d) {
        addOneWay(graph, a, b, d);
        addOneWay(graph, b, a, d);
    }

    static void bfsReachable(HashMap<String, ArrayList<Road>> graph, String start) {
        Queue<String> q = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();

        q.add(start);
        visited.add(start);

        while (!q.isEmpty()) {
            String node = q.poll();
            System.out.print(node + " ");

            for (Road r : graph.get(node)) {
                if (!visited.contains(r.to)) {
                    visited.add(r.to);
                    q.add(r.to);
                }
            }
        }
    }

    static void bfsPath(HashMap<String, ArrayList<Road>> graph, String start, String end) {
        Queue<String> q = new LinkedList<>();
        HashMap<String, String> parent = new HashMap<>();
        HashSet<String> visited = new HashSet<>();

        q.add(start);
        visited.add(start);

        while (!q.isEmpty()) {
            String node = q.poll();

            if (node.equals(end)) break;

            for (Road r : graph.get(node)) {
                if (!visited.contains(r.to)) {
                    visited.add(r.to);
                    parent.put(r.to, node);
                    q.add(r.to);
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
        System.out.println(path);
    }
}