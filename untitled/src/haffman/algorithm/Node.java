package haffman.algorithm;

public class Node implements Comparable<Node> {

    final int sum;
    String code;
    byte[] byteArr;

    public Node(int sum) {
        this.sum = sum;
    }

    public void buildCode(String code) {
        this.code = code;



    }

    public int compareTo(Node o) {
        return Integer.compare(sum, o.sum);
    }

}





