class ValidBST {
    static class Node {
        long val;
        Node left;
        Node right;

        Node(int data) {
            this.val = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean checkValid(Node node, long min, long max) {
        if(node == null) return true;

        if(node.val <= min || node.val >= max) return false;

        return checkValid(node.left, min, node.val) && checkValid(node.right, node.val, max);
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.right.left = new Node(4);
        root.right.right = new Node(8);

        System.out.println(checkValid(root, Long.MIN_VALUE, Long.MAX_VALUE));
    }
}