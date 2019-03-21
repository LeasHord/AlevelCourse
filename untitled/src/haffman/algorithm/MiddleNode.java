package haffman.algorithm;

public class MiddleNode extends Node {
    Node left;
    Node right;
    byte[]byteArr;

    @Override
    public void buildCode(String code){
       super.buildCode(code);
       left.buildCode(code + "0");
       right.buildCode(code + "1");
        byteArr = code.getBytes();
        StringBuilder binary = new StringBuilder();
        for (byte b : byteArr) {
            int val = b;
            for (int i = 0; i < 8; i++) {
                binary.append((val & 128) == 0 ? 1 : 0);
                val <<= 1;
            }
        }
        System.out.println(binary);
    }
    public MiddleNode(Node left, Node right) {
        super(left.sum + right.sum);
        this.left = left;
        this.right = right;
    }
}
