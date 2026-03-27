class LCA {
    static class Node {
        long data;
        Node left;
        Node right;

        Node(long data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean exists(Node root, long val) {
        while(root != null) {
            if(val < root.data) root = root.left;
            else if(val > root.data) root = root.right;
            else return true;
        }
        return false;
    }

    public static Node lowestCommonAncestor(Node root, long p, long q) {
        if(root == null) return null;

        if(!exists(root, p) || !exists(root, q)) return null;

        while(root != null) {
            if(p < root.data && q < root.data) {
                root = root.left;
            }
            else if(p > root.data && q > root.data) {
                root = root.right;
            }
            else {
                return root;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Node root = new Node(6);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(0);
        root.left.right = new Node(4);
        root.left.right.left = new Node(3);
        root.left.right.right = new Node(5);
        root.right.left = new Node(7);
        root.right.right = new Node(9);

        Node ans = lowestCommonAncestor(root, 2, 4);

        System.out.println(ans != null ? ans.data : "Not found");
    }
}