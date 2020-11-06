package ci646.huffman;
/**
 * The class implementing the Huffman coding algorithm.
 */

import ci646.huffman.tree.Branch;
import ci646.huffman.tree.Leaf;
import ci646.huffman.tree.Node;

import java.util.*;

public class Huffman {

    /**
     * Build the frequency table containing the unique characters from the String `input' and the number of times
     * that character occurs.
     *
     * @param input
     * @return
     */
    public static Map<Character, Integer> freqTable (String input) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    /**
     * Given a frequency table, construct a Huffman tree.
     *
     * First, create an empty priority queue.
     *
     * Then make every entry in the frequency table into a leaf node and add it to the queue.
     *
     * Then, take the first two nodes from the queue and combine them in a branch node that is
     * labelled by the combined frequency of the nodes and put it back in the queue.
     *
     * Do this repeatedly until there is a single node in the queue, which is the Huffman tree.
     *
     * @param freqTable
     * @return
     */
    public static Node treeFromFreqTable(Map<Character, Integer> freqTable) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    /**
     * Construct the map of characters and codes from a tree. Just pass the empty code map to the traverse
     * method of the tree along with an empty list, then return the populated code map.
     *
     * @param tree
     * @param code
     * @return
     */
    public static Map<Character, List<Boolean>> buildCode(Node tree, Map<Character, List<Boolean>> code) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    /**
     * Create the huffman coding for an input string by calling the various methods written above. I.e. create the
     * frequency table, use that to create the Huffman tree then extract the code map of characters and their codes
     * from the tree. Then to encode the input data, loop through the input looking each character in the map and add
     * the code for that character to a list representing the data.
     *
     * @param input
     * @return
     */
    public static HuffmanCoding encode(String input) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    /**
     * Reconstruct a Huffman tree from the map of characters and their codes. Only the structure of this tree
     * is required and frequency labels of all nodes can be set to zero.
     *
     * Your tree will start as a single Branch node with null children.
     *
     * Then for each character key in the code, c, take the list of booleans, bs, corresponding to c. Make
     * a local variable referring to the root of the tree. For every boolean, b, in bs, if b is false you want to "go
     * left" in the tree, otherwise "go right".
     *
     * Presume b is false, so you want to go left. So long as you are not at the end of the code so you should set the
     * current node to be the left-hand child of the node you are currently on. If that child does not
     * yet exist (i.e. it is null) you need to add a new branch node there first. Then carry on with the next entry in
     * bs. Reverse the logic of this if b is true.
     *
     * When you have reached the end of this code (i.e. b is the final element in bs), add a leaf node
     * labelled by c as the left-hand child of the current node (right-hand if b is true). Then take the next char from
     * the code and repeat the process, starting again at the root of the tree.
     *
     * @param code
     * @return
     */
    public static Node treeFromCode(Map<Character, List<Boolean>> code) {
        throw new UnsupportedOperationException("Method not implemented");
    }


    /**
     * Decode some data using a map of characters and their codes. To do this you need to reconstruct the tree from the
     * map. Take one boolean at a time from the data and use it to traverse the tree
     * by going left for false, right for true. Every time you reach a leaf you have decoded a single character (the
     * label of the leaf). Add it to the result and return to the root of the tree.
     *
     * @param map
     * @param data
     * @return
     */
    public static String decode(Map<Character, List<Boolean>> map, List<Boolean> data) {
        throw new UnsupportedOperationException("Method not implemented");
    }
}
