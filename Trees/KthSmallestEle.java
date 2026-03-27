class KthSmallestEle {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    int counter = 0;
    int result = -1;
    
    public int KSEle(Node root,int k) {
        inorder(root, k);
        return result;
    }

    private void inorder(Node node, int k) {
        // step 1: base case + early stopping
        if(node ==  null || counter >= k) return;

        // step 2: go left
        inorder(node.left, k);

        // step 3: process current node
        counter++;
 
        if(counter == k) {
            result = node.val;
            return;
        }

        //step 4: go right
        inorder(node.right, k);

    }

    public void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        int k = 3;

        System.out.println(KSEle(root, k));
    }
}