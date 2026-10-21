public class Binarytree {
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
        }
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
        //postOrder(root.right);
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    static Node root;
    public static void main(String[] args){
        Binarytree tree = new Binarytree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        System.out.println("PreOrder : ");
        preOrder(root);
        System.out.println("\nPostOrder : ");
        postOrder(root);
        System.out.println("\nInOrder : ");
        inOrder(root);
    }
}
