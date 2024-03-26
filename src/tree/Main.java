package tree;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(2,
                new Node(3, new Node(5, null, null),
                        new Node(6, null, null)),
                new Node(4, null, null));

        int result = findSum(root);

        System.out.println(result);
    }

    static int findSum(Node root){
        if(root == null) return 0;
        return root.data + findSum(root.left) + findSum(root.right);
    }
}
