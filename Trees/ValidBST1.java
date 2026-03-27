class ValidBST1 {
    static class Node {
        long val;
        Node left;
        Node right;

        Node(long val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static class Prev {
        long val = Long.MIN_VALUE;
    }
    public static boolean inOrder(Node node, Prev prev) {
        if(node ==  null) return true;

        if(!inOrder(node.left, prev)) return false;

        if(node.val <= prev.val) return false;
        prev.val = node.val;

        return inOrder(node.right, prev);
    }
    
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.right.left = new Node(4);
        root.right.right = new Node(8);

        System.out.println(inOrder(root, new Prev()));
    }
}