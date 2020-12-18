package ci646.huffman.tree;

import ci646.huffman.util.TreePrinter;

import java.util.List;
import java.util.Map;
/**
 * The parent class of nodes in a Huffman tree.
 */
public abstract class Node {
    private int freq;

    public Node(int freq) {
        this.freq = freq;
    }

    public int getFreq() {
        return freq;
    }

    public void setFreq(int freq) {
        this.freq = freq;
    }

    /**
     * The traverse method is used to construct the map of characters (stored in leaves of the tree)
     * and binary codes (representing the paths from the root to the leaves). In the Branch class this method
     * should be called recursively on the left and right children of the branch, adding `false` to the list
     * of booleans passed to the left child and `true` to the list of booleans passed to the right. In the Leaf class
     * the method should store the pair of the character (the label of the leaf) and the list of booleans (the path
     * to that leaf) in the map.
     * @param map   The map of the tree, which is shared among recursive invocations of the method.
     * @param list  The list representing paths through the tree, modified copies of which are passed to
     *              recursive invocations of the method.
     */
    public abstract void traverse(Map<Character, List<Boolean>> map, List<Boolean> list);

    public String toString() {
        return TreePrinter.traversePreOrder(this);
    }

}
