package datastructure.tree;

public class BinaryTree {
    Node root;

    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    public Node insertRecursive(Node root, int data) {
        if (root == null)
            root = new Node(data);
        else if (data < root.data)
            root.left = insertRecursive(root.left, data);
        else if (data > root.data)
            root.right = insertRecursive(root.right, data);

        return root;
    }

    // Inorder = left -> root -> right
    // preorder = root -> left -> right
    // postorder = left -> right -> root

    // We are implementing in order traversal
    public void preOrder() {
        preOrderRecursive(root);
        System.out.println();
    }

    public void preOrderRecursive(Node root) {
        if (root != null) {
            preOrderRecursive(root.left);
            System.out.print(root.data + " ");
            preOrderRecursive(root.right);
        }
    }

    public void postOrder() {
        postOrderRecursive(root);
        System.out.println();
    }

    public void postOrderRecursive(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            postOrderRecursive(root.left);
            postOrderRecursive(root.right);
        }
    }
}
