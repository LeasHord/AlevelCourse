package haffman.algorithm;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Compressor {

    private void buildTree() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("src/Input.txt"));
        String str = scan.next();

            Map<Character, Integer> countChars = new HashMap<>();
            for (char ch : str.toCharArray()) {
                if (countChars.containsKey(ch)) {
                    countChars.put(ch, countChars.get(ch) + 1);

                } else {
                    countChars.put(ch, 1);
                }
            }
            Map<Character, Node> charsNodes = new HashMap<>();
            Queue<Node> priorityQueue = new PriorityQueue<>();
            for (Map.Entry<Character, Integer> entry : countChars.entrySet()) {
                LeafNode node = new LeafNode(entry.getKey(), entry.getValue());
                charsNodes.put(entry.getKey(), node);
                priorityQueue.add(node);
            }
            while (priorityQueue.size() > 1) {
                Node left = priorityQueue.poll();
                Node right = priorityQueue.poll();
                MiddleNode node = new MiddleNode(left, right);
                priorityQueue.add(node);
            }
            Node root = priorityQueue.poll();
            root.buildCode("");

        }

        public File convertAndWrite(String str) throws IOException {
        File writtenFile = new File("src/EncodedString.hf");
            FileWriter writer = new FileWriter("EncodedString.hf");
            String binary = new BigInteger(str.getBytes()).toString(2);
            writer.write(binary);
            return writtenFile;
        }


    public static void main(String[] args) throws FileNotFoundException {


        new Compressor().buildTree();




    }
}
