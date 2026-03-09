import java.util.*;
class TreeTraversal{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void preorder(Node root) {  // 1 -> 2 -> 4 -> 5 -> 3
        if(root == null) return;

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {  // 4 -> 2 -> 5 -> 1 -> 3
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void postorder(Node root) {  // 4 -> 5 -> 2 -> 3 -> 1
        if(root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }


    public static void levelOrder(Node root) {

        if(root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {

            Node current = q.poll();
            System.out.print(current.data + " ");

            if(current.left != null)
                q.add(current.left);

            if(current.right != null)
                q.add(current.right);
        }
    }

    public static void levelOrderLine(Node root) {

        if(root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {

            int size = q.size();

            for(int i = 0; i < size; i++) {

                Node current = q.poll();
                System.out.print(current.data + " ");

                if(current.left != null)
                    q.add(current.left);

                if(current.right != null)
                    q.add(current.right);
            }

            System.out.println(); // new line after each level
        }
    }

    public static int height(Node root) {

    if(root == null) return 0;

    int leftHeight = height(root.left);
    int rightHeight = height(root.right);

    return 1 + Math.max(leftHeight, rightHeight);
    }

    public static int count(Node root) {
        if(root == null) return 0;

        int left = count(root.left);
        int right = count(root.right);

        return 1 + left + right;
    }

    public static int sumOfNodes(Node root){
        if(root == null) return 0;

        int left = sumOfNodes(root.left);
        int right = sumOfNodes(root.right);

        return root.data + left + right;
    }

    public static int noOfLeafNodes(Node root) {
        int left = Integer.MIN_VALUE;
        int right = Integer.MIN_VALUE;

        if(root == null) return 0;

        if(root.left == null && root.right == null) return 1;
        else{
            left = noOfLeafNodes(root.left);
            right = noOfLeafNodes(root.right);
        }

        return left + right;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("Preorder: ");
        preorder(root);
        System.out.println();

        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();

        System.out.print("Postorder: ");
        postorder(root);
        System.out.println();

        System.out.print("LevelOrder: ");
        levelOrder(root);
        System.out.println();

        System.out.print("LevelOrderLine: ");
        levelOrderLine(root);
        System.out.println();

        System.out.print("Height: ");
        System.out.println(height(root));
        System.out.println();
    }
}

