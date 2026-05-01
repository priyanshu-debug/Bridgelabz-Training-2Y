class Node {
    int data;
    Node left, right;

    Node(int d) { data = d; }
}

public class Inorder {
    static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}