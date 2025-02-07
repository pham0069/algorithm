package data_structure.tree;

public class Node {
    private static int COUNTER = 0;
    public int id;
    public int key;
    public Node left, right;
    public Node(int key) {
        this.id = COUNTER ++;
        this.key = key;
        this.left = this.right = null;
    }
    public void setLeft(Node left) {
        this.left = left;
    }
    public void setRight(Node right) {
        this.right = right;
    }

    /**
     *         1
     *        / \
     *       2   3
     *      /\
     *     4  5
     */
    public static Node createTestTree() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        return root;
    }

    /**
     *         1
     *        / \
     *       2   3
     *      / \
     *     4   5
     *     \  /
     *     6 7
     */
    public static Node createTestTree2() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.right = new Node(6);
        root.left.right = new Node(5);
        root.left.right.left = new Node(7);
        return root;
    }

    /**
     *         1
     *        / \
     *       2   3
     *      / \
     *     4   5
     *     \  /
     *     6 3
     */
    public static Node createTestTree3() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.right = new Node(6);
        root.left.right = new Node(5);
        root.left.right.left = new Node(3);
        return root;
    }


    public static Node createTestTree4() {
        Node root = new Node(7);
        root.left = new Node(7);
        root.right = new Node(7);
        root.left.left = new Node(8);
        root.left.right = new Node(3);
        root.right.right = new Node(7);
        return root;
    }

    public static Node createTestTree5() {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(4);
        root.left.left = new Node(3);
        root.left.left.left = new Node(3);
        root.left.left.right = new Node(3);
        root.right.right = new Node(5);
        return root;
    }
}
