class Node {
    int data;
    Node left, right;

    Node(int d) { data = d; }
}

public class SearchBST {
    static boolean search(Node root, int key) {
        if (root == null) return false;

        if (root.data == key) return true;

        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }
}