class Node {
    int data;
    Node left, right;

    Node(int d) { data = d; }
}

public class Preorder {
    static void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
}