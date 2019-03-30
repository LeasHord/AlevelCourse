package com.Alevel.Haffman;

import java.io.FileWriter;
import java.util.*;

public class TreeBuilder {
    String str;

    public Node[] buildTreeByString(String str) {
        Map<Character, Integer> numberOfSymbols = buildRepetitionsMap(str);
        List<Node> nodes = mapToNode(numberOfSymbols);
        Node tree = nodesToTree(nodes);
         Map<Character, Node> buildTableByTree = new HashMap<>();


        return null;
    }



    protected Map<Character, Integer> buildRepetitionsMap( String str) {
        char[] charSequence = str.toCharArray();
        Map<Character, Integer> numberOfSymbols = new HashMap<>();
        for (char ch : charSequence) {
            if (numberOfSymbols.containsKey(ch)) {
                int counter = numberOfSymbols.get(ch);
                numberOfSymbols.put(ch, counter+1);
            } else numberOfSymbols.put(ch, 1);
        }
        return numberOfSymbols;
    }

    protected Node nodesToTree(List<Node> nodes) {
        Queue<Node> nodeQueue = new PriorityQueue<>(nodes);
        while (nodeQueue.size() > 1) {
            Node left = nodeQueue.poll();
            Node right = nodeQueue.poll();
            nodeQueue.add(new Node(Character.MIN_VALUE, (left.getWeight() + right.getWeight()), right, left));
        }
        return nodeQueue.poll();
    }


    protected List<Node> mapToNode(Map<Character, Integer> charRepetitions) {
        List<Node> nodes = new ArrayList<>();
        for (Character character : charRepetitions.keySet()) {
            nodes.add(new Node(character, charRepetitions.get(character), null, null));
        }
        return nodes;
    }



}
