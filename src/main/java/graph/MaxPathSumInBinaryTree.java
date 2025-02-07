package graph;

/**
 * https://www.geeksforgeeks.org/find-maximum-path-sum-in-a-binary-tree/
 * Given a binary tree, find the maximum path sum. The path may start and end at any node in the tree.
 *
 * Example:
 * Input: Root of below tree
    1
   / \
 2   3
 * Output: 6
 * Explanation: max path goes through all nodes, whose sum is 1+2+3 = 6
 *
 * ---------------------------------------------------------------------------------------------------------------------
 *
 * For each node there can be four ways that the max path goes through the node:
 1. Node only
 2. Max path through Left Child + Node
 3. Max path through Right Child + Node
 4. Max path through Left Child + Node + Max path through Right Child
 * The idea is to keep trace of four paths and pick up the max one in the end. An important thing to note is, root of
 * every subtree need to return maximum path sum such that at most one child of root is involved. This is needed for
 * parent function call.
 */
public class MaxPathSumInBinaryTree {
    public static void main(String[] args) {

    }
}
