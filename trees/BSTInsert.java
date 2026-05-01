class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
    }
}

public class BSTInsert {
    static Node insert(Node root, int data) {
        if (root == null) return new Node(data);

        if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);

        return root;
    }

    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 70);

        System.out.println("Inserted");
    }
}