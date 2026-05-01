import java.util.*;

class MyHashMap {
    class Node {
        int key;
        int value;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    LinkedList<Node>[] bucket = new LinkedList[10];

    MyHashMap() {
        for (int i = 0; i < 10; i++) {
            bucket[i] = new LinkedList<>();
        }
    }

    int hash(int key) {
        return key % 10;
    }

    void put(int key, int value) {
        int index = hash(key);

        for (Node node : bucket[index]) {
            if (node.key == key) {
                node.value = value;
                return;
            }
        }

        bucket[index].add(new Node(key, value));
    }

    int get(int key) {
        int index = hash(key);

        for (Node node : bucket[index]) {
            if (node.key == key) {
                return node.value;
            }
        }

        return -1;
    }

    void remove(int key) {
        int index = hash(key);

        for (Node node : bucket[index]) {
            if (node.key == key) {
                bucket[index].remove(node);
                return;
            }
        }
    }
}

public class CustomHashMapDemo {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put(1, 100);
        map.put(2, 200);

        System.out.println(map.get(1));

        map.remove(1);

        System.out.println(map.get(1));
    }
}