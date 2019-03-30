package com.Alevel.Haffman;

public class Node implements Comparable<Node>{

  private final char symbol;
  private final int weight;
  private final Node rightNode;
  private final Node leftNode;
  String binaryCode;


    public Node(char symbol, int weight, Node rightNode, Node leftNode) {
        this.symbol = symbol;
        this.weight = weight;
        this.rightNode = rightNode;
        this.leftNode = leftNode;
    }

    public void buildBinaryCode(String binaryCode){
        this.binaryCode = binaryCode;
        leftNode.buildBinaryCode(binaryCode + "0");
        rightNode.buildBinaryCode(binaryCode + "1");
    }

    public char getSymbol() {
        return symbol;
    }

    public int getWeight() {
        return weight;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }


    public boolean isLeaf(){
        if(leftNode == null & rightNode == null){
            return true;
        } return false;
    }



    public int compareTo(Node o) {
        return this.weight - o.weight;
    }
}
